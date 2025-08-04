class Solution {
    int maxSubarraySum(int[] arr) {
       //APPROACH 1
    //   int sum=0,maxSum=Integer.MIN_VALUE;
    //   for(int start=0;start<arr.length;start++){
    //       for(int end=start;end<arr.length;end++){
    //           for(int k=start;k<=end;k++){
    //               sum+=arr[k];
    //           }
    //           maxSum=sum>maxSum? sum:maxSum;
    //           sum=0;
    //       }
    //   }
    //   return maxSum;
    
    // APPROACH 2
    // int temp[]=new int[arr.length];
    // int sum=0,maxSum=Integer.MIN_VALUE;
    // temp[0]=arr[0];
    //  for(int i=1;i<arr.length;i++){
    //   temp[i]=temp[i-1]+arr[i];
    //  }
    //   for(int start=0;start<temp.length;start++){
    //   for(int end=start;end<temp.length;end++){
    //         sum=start==0 ? temp[end] : temp[end]-temp[start-1];
    //         maxSum=Math.max(maxSum,sum);
    //     }
    //     sum=0;
    // }
    // return maxSum;
    
    //APPROACH 3
    int currSum=0,maxSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        currSum+=arr[i];
        maxSum=currSum>maxSum? currSum : maxSum;
        if(currSum<0){
            currSum=0;
        }
    }
    return maxSum;
   }
}
