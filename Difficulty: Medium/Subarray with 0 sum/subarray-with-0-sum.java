class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
    //   int prefixSum[]=new int[arr.length];
    //   prefixSum[0]=arr[0];
    //   for(int i=1;i<arr.length;i++){
    //       prefixSum[i]=prefixSum[i-1]+arr[i];
    //   }
       
    //   int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //          for(int j=i;j<arr.length;j++){
    //              sum= i==0 ? prefixSum[j] : prefixSum[j]-prefixSum[i-1];
    //              if(sum==0)
    //               return true;
    //          }
    //     }
    //     return false;
        
        // APPROACH 2
        int prefixSum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            prefixSum+=num;
            if(prefixSum==0 || set.contains(prefixSum)) return true;
            set.add(prefixSum);
        }
        return false;
    }
}