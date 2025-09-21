class Solution {
    static int setAllRangeBits(int N, int L, int R) {
        for(int i=L-1;i<=R-1;i++){
            N|=1<<i;
        }
        return N;
    }
};
