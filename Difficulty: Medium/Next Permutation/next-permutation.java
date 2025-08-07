class Solution {
    void nextPermutation(int[] arr) {
        int i=arr.length-2;
        int j=0;
        while(i>=0 && arr[i]>=arr[i+1])
          i--;
        if(i>=0){
             j=arr.length-1;
            while(arr[i]>=arr[j])
              j--;
              swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
        
    }
    public static void swap(int arr[] ,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void reverse(int arr[],int start,int end){
        while(start<=end){
         swap(arr,start,end);
         start++;
         end--;
        }
    }
}