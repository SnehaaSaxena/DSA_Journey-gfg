// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        String str=arr[0];
        for(int i=1;i<arr.length;i++){
            int j=0;
            while(j<str.length() && j<arr[i].length()){
                if(str.charAt(j)!=arr[i].charAt(j))
                   break;
                else
                  j++;
            }
            if(j==0) return "";
            str=str.substring(0,j);
        }
        return str;
    }
}