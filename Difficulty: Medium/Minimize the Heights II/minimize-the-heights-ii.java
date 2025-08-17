class Solution {
    public int getMinDiff(int[] arr, int k) {
       Arrays.sort(arr);
       int diff=arr[arr.length-1]-arr[0];
       int min,max;
       for(int i=1;i<arr.length;i++){
           if((arr[i]-k)<0)
             continue;
             max=Math.max(arr[i-1]+k,arr[arr.length-1]-k);
             min=Math.min(arr[i]-k,arr[0]+k);
             diff=Math.min(diff,max-min);
       }
       return diff;
    }
}

// 1,5,8,10  k=2-> min=1 , max=10 , diff=9 we need to find smallest diff so min+k and max-k 1+2=3 and 10-2=8 now min=3 and max=8 we are increasing the min i.e 
// arr[i-1] so compare it with max  and we are decreasing the max i.e arr[i] so comapre it with min
