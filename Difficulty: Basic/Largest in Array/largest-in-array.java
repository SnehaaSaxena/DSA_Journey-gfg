class Solution {
    public static int largest(int[] arr) {
        // 1st way
        
        // int largest=0;
        // for(int i=0;i<arr.length;i++){
        //     largest=arr[i]>largest? arr[i] : largest;
        // }
        // return largest;
        
        // 2nd way
        
        // Arrays.sort(arr);
        // return arr[arr.length-1];
        
        // 3rd way
         return findMax(arr,0);
    }
       static int findMax(int arr[], int i){
             if(i==arr.length-1){
                 return arr[i];
             }
             int partiallyMax= findMax(arr,i+1);
             return Math.max(partiallyMax,arr[i]);
         }
}

