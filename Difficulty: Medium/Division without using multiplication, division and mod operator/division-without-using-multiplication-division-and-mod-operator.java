// User function Template for Java

class Solution {
    public static long divide(long dividend, long divisor) {
        // long count=0,sum=0;
        // while(sum+divisor<=dividend){
        //     count++;
        //     sum+=divisor;
        // }
        // return count;
    
    
    // USING BIT MANIPULATION
    if(dividend==divisor) return 1;
    boolean sign=true;
    if(dividend>=0 && divisor<0) sign=false;
    else if(dividend<=0 && divisor>0) sign=false;
    long n=Math.abs(dividend);
    long d=Math.abs(divisor);
    long quotient=0;
    while(n>=d){
        int count=0;
        while(n>=(d<<(count+1))){
            count++;
        }
        quotient+=1<<count;
        n-=d<<count;
    }
    if(quotient==(1<<31) && sign) return Integer.MAX_VALUE;
    if(quotient==(1<<31) && !sign) return Integer.MIN_VALUE;
    return sign ? quotient : -quotient;
 }

}



