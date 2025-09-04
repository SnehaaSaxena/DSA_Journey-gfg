/*Complete the function given below*/
class Solution {
    // Returns area of the largest rectangle with all 1s in mat[][]
    static int maxArea(int mat[][]) {
        int largestArea=0;
        int heights[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0)
                 heights[j]=0;
                else
                 heights[j]+=mat[i][j];
            }
               int maxArea=largestRectArea(heights);
               largestArea=Math.max(largestArea,maxArea);
        }
        return largestArea;
    }
    static int largestRectArea(int[] height){
        int maxArea=0;
        int lsr[]=new int[height.length];
        int rsr[]=new int[height.length];
        // left smaller rectangle
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty() && height[st.peek()]>=height[i]) st.pop();
            if(st.isEmpty()) lsr[i]=-1;
            else lsr[i]=st.peek();
            st.push(i);
        }
        st=new Stack<>();
        for(int i=height.length-1;i>=0;i--){
            while(!st.isEmpty() && height[st.peek()]>=height[i]) st.pop();
            if(st.isEmpty()) rsr[i]=height.length;
            else rsr[i]=st.peek();
            st.push(i);
        }
        for(int i=0;i<height.length;i++){
            int width=rsr[i]-lsr[i]-1;
            int area=height[i]*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}