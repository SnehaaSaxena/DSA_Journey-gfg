class Solution {
    public static int countSetBits(int n) {
    //     int count=0;
    //     for(int i=1;i<=n;i++){
    //       count+=setBit(i);
    //     }
    //     return count;
    // }
    // public static int setBit(int num){
    //     int count=0;
    //     while(num!=0){
    //         if((num&1)==1) count++;
    //         num=num/2;
    //     }
    //     return count;
    
    // Another way
       if(n==0){
           return 0;
       }
       int x=largestPower2(n);
       int bitTill2power=x*(1<<(x-1));
       int msbBit=n-(1<<x)+1;
       int res=n-(1<<x);
       int ans=bitTill2power+msbBit+countSetBits(res);
       return ans;
    }
    
    public static int largestPower2(int n){
        int x=0;
        while((1<<x)<=n) x++;
        return x-1;
    }
}