// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // StringBuilder sb=new StringBuilder(s);
        // sb.reverse();
        // return sb.toString();
        
        // APPROACH 2
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char alpha=st.pop();
            sb.append(alpha);
         }
        return sb.toString();
    }
}