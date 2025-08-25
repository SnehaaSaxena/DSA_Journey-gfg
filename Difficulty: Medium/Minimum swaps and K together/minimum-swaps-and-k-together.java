// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // int lesstk=0,count=0,max=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=k)
        //      lesstk++;
        // }
        
        // for(int i=0;i<=arr.length-lesstk;i++){
        //     int j=i;
        //     for(int start=0;start<lesstk;start++){
        //         if(arr[j]<=k)
        //          count++;
        //          j++;
        //      }
        //     max=Math.max(max,count);
        //     count=0;
        // }
        // return lesstk-max;
        
        //APROACH 2(SLIDING WINDOW)
        int fav=0,nonfav=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) fav++;
        }
        for(int i=0;i<fav;i++){
            if(arr[i]>k) nonfav++;
        }
        int l=0, r=fav-1,res=Integer.MAX_VALUE;
        while(r<arr.length){
            res=Math.min(res,nonfav);
            r++;
            if(r<arr.length && arr[r]>k) nonfav++;
            if(l<arr.length && arr[l]>k) nonfav--;
            l++;
        }
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}
