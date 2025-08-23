class Solution {
    public int maxWater(int arr[]) {
        int leftHighest[]=new int[arr.length];
        int rightHighest[]=new int[arr.length];
        
        leftHighest[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftHighest[i]=Math.max(leftHighest[i-1],arr[i]);
        }
        
         rightHighest[arr.length-1]=arr[arr.length-1];
         for(int i=arr.length-2;i>=0;i--){
            rightHighest[i]=Math.max(rightHighest[i+1],arr[i]);
        }
        
        int totalWater=0;
        for(int i=0;i<arr.length;i++){
            int height=Math.min(leftHighest[i],rightHighest[i]);
            totalWater+=height-arr[i];
        }
        return totalWater;
    }
}
