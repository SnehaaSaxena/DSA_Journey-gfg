class Solution {
    static int minJumps(int[] arr) {
        int totalJumps=0,destination=arr.length-1,coverage=0,lastJumpIdx=0;
        if(arr.length==1)
          return 0;
          
        for(int i=0;i<arr.length;i++){
            coverage=Math.max(coverage,arr[i]+i);
            if(i==lastJumpIdx){
                if(coverage==i){
                    totalJumps=-1;
                    break;
                }
                lastJumpIdx=coverage;
                totalJumps++;
                
                if(coverage>=destination){
                    return totalJumps;
                }
            }
        }
       return totalJumps; 
    }
}