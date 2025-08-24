class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
       // Arrays.sort(arr); approach 1
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]>=a && arr[mid]<=b) mid++;
            else if(arr[mid]<a){
               int temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               mid++;
               low++;
            }else{
               int temp=arr[high];
               arr[high]=arr[mid];
               arr[mid]=temp;
               high--;
            } 
         }
    }
}