class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        int i=0,j=0;
        String temp="";
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int count=j-i;
                temp+=count;
                temp+=s.charAt(i);
                i=j;
            }
        }
        int count=j-i;
        temp+=count;
        temp+=s.charAt(i);
        return temp;
        
    }
}
