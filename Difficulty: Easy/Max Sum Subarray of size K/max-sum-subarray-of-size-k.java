class Solution {
    public int maxSubarraySum(int[] arr, int k) {
         int sum=0,maxSum=0,i=0;
        while(i<k){
            sum+=arr[i];
            i++;
        }
        maxSum=sum;
        i=1;
        while(i<arr.length-k+1){
            sum=sum-arr[i-1]+arr[i+k-1];
            i++;
            maxSum=sum>maxSum? sum : maxSum;
        }
       return maxSum; 
        
    }
}