class Solution {
    public int minFlips(String s) {
        int flip1=0,flip2=0;
        //case1: even places=0 and odd places=1
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)!='0') flip1++;
            if(i%2!=0 && s.charAt(i)!='1') flip1++;
        }
        //case1: even places=1 and odd places=0
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)!='1') flip2++;
            if(i%2!=0 && s.charAt(i)!='0') flip2++;
        }
        return Math.min(flip1,flip2);
    }
}