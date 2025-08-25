class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0)
            return (double)(arr[n/2]+arr[(n/2-1)])/2;
        else
            return (double)arr[n/2];
    }
}
