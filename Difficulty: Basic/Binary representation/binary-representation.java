class Solution {
    static String getBinaryRep(int n) {
        String res="";
        for(int i=31;i>=0;i--){
             res+=((n>>i)&1);
        }
        return res;
    }
}