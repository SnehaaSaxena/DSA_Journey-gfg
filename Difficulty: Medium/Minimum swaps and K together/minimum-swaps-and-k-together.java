// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        int lesstk=0,count=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k)
             lesstk++;
        }
        
        for(int i=0;i<=arr.length-lesstk;i++){
            int j=i;
            for(int start=0;start<lesstk;start++){
                if(arr[j]<=k)
                 count++;
                 j++;
             }
            max=Math.max(max,count);
            count=0;
        }
        return lesstk-max;
    }
}
