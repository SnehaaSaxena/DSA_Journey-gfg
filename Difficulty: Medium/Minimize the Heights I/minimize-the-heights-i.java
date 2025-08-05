// User function Template for Java
class Solution {
    public int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int diff=arr[arr.length-1]-arr[0];
        int max,min;
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i-1]+k,arr[arr.length-1]-k);
            min=Math.min(arr[i]-k,arr[0]+k);
            diff=Math.min(diff,max-min);
        }
        return diff;
    }
}