// User function Template for Java

class Solution {
  public static int smallestSubWithSum(int x, int[] arr) {
      int min=Integer.MAX_VALUE,count=0;
      for(int i=0;i<arr.length;i++){
          int sum=0;
          for(int j=i;j<arr.length;j++){
              sum+=arr[j];
              if(sum>x){
                  count=(j-i)+1;
                  min=Math.min(min,count);
                  break;
              }
          }
      }
      if(min<=arr.length)
      return min;
      else
      return 0;
    }
}
