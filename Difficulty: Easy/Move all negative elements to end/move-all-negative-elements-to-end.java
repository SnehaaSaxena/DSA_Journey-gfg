// User function Template for Java

// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
       int arr2[]=new int[arr.length];
       int counter=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>=0)
               arr2[counter++]=arr[i];
         }
       for(int i=0;i<arr.length;i++){
           if(arr[i]<0)
               arr2[counter++]=arr[i];
        }
       
         for(int i=0;i<arr.length;i++){
             arr[i]=arr2[i];
         }
    }
}