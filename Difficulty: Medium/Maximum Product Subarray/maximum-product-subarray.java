class Solution {
    int maxProduct(int[] arr) {
        int i=0,j=arr.length-1,leftPro=1,rightPro=1,maxPro=Integer.MIN_VALUE;
        while(i<arr.length && j>=0){
            leftPro*=arr[i++];
            rightPro*=arr[j--];
            maxPro=Math.max(maxPro,Math.max(leftPro,rightPro));
            if(leftPro==0)
              leftPro=1;
            if(rightPro==0)
             rightPro=1;
           
        }
        return maxPro;
    }
}