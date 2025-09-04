class Solution {
    public int kthSmallest(int[][] arr, int k) {
        int start=arr[0][0],end=arr[arr.length-1][arr[0].length-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            int lesserElem=findLesserElem(arr,mid);
            if(lesserElem<k)
              start=mid+1;
            else
              end=mid-1;
        }
       return start; 
    }
    public int findLesserElem(int[][] arr, int num){
        int lesserElem=0;
        for(int i=0;i<arr.length;i++){
            int start=0,end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[i][mid]<=num)
                  start=mid+1;
                else
                  end=mid-1;
            }
            lesserElem+=start;
        }
        return lesserElem;
    }
}
