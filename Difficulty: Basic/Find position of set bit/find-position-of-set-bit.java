// User function Template for Java

class Solution {
    static int findPosition(int n) {
       int count=0;
       int setBits=countSetBit(n);
       if(setBits>1 || n==0) return -1;
       while(n!=0){
           if((n&1)!=1){
             count++;
             n=n>>1;
           }else{
               return count+1;
           }
       }
       return 0;
    }
    public static int countSetBit(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&n-1;
        }
        return count;
    }
}