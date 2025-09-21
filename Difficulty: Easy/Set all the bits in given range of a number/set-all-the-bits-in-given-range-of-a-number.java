// User function Template for Java

class Solution {
    static int setAllRangeBits(int N, int L, int R) {
        int toSet=L-1;
        for(int i=1;i<=R-L+1;i++){
            N=N|1<<toSet;
            toSet++;
        }
        return N;
    }
};