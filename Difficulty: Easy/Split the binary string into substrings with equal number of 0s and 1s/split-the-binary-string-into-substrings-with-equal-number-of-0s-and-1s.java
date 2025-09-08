// User function Template for Java

class Solution {
    public static int maxSubStr(String str) {
        int oneC=0,zeroC=0,totalCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1') oneC++;
            else zeroC++;
            if(oneC==zeroC){
              totalCount++;
              oneC=0;
              zeroC=0;
            } 
        }
        return oneC==zeroC ? totalCount : -1;
    }
}