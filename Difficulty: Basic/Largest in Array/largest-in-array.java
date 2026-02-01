class Solution {
    public static int largest(int[] arr) {
        // 1st way
        int largest=0;
        for(int i=0;i<arr.length;i++){
            largest=arr[i]>largest? arr[i] : largest;
        }
        return largest;
    }
}
