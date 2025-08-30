// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
    //     int count, maxCount=Integer.MIN_VALUE,row=-1;
    //   for(int i=0;i<arr.length;i++){
    //       count=0;
    //       for(int j=0;j<arr[0].length;j++){
    //           if(arr[i][j]==1)
    //           count++;
    //       }
    //       if(count>maxCount){
    //         maxCount=count;
    //         row=i;
    //       }
    //   }
    //   return row;
    
    
    //APPROACH 2 (it says if we found 1 then all the elements after that are also 1 because it ia a sorted matrix)
    int left=0,right=arr[0].length-1,res=-1;
    while(left<arr.length && right>=0){
        if(arr[left][right]==1){
            res=left;
            right--;
        }else
            left++;
    }
     return res;
  }
}

