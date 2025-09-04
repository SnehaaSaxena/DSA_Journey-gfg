class Solution {
    public static int kthSmallest(int[] arr, int k) {
       //APPROACH 1
       //Arrays.sort(arr);
       //return arr[k-1];
       
       //APPROACH 2
       int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           max=arr[i]>max ? arr[i]:max;
       }
       int freq[]=new int[max+1];
       for(int i=0;i<arr.length;i++){
           freq[arr[i]]++;
       }
       for(int i=0;i<freq.length;i++){
           if(freq[i]>0){
               k--;
               if(k==0)
                 return i;
           }
       }
       return -1;
    }
}
