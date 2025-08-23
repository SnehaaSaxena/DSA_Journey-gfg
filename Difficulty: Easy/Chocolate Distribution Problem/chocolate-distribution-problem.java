// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++){
              if((i+m-1)<arr.size()){
              int diff=arr.get(i+m-1)-arr.get(i);
              min=Math.min(min,diff);
          }else
            break;
        }
        return min;
    }
}