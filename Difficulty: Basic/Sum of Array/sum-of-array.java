// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // } 
        // return sum;
        
        
         // way 2 (RECURSIVE METHOD)
         return findSum(arr,0);
      }
      
      int findSum(int arr[], int i){
          if(i==arr.length-1){
              return arr[i];
          }
          return findSum(arr,i+1)+arr[i];
      }
}
