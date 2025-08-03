// User function Template for Java

class Solution {
    public static String reverseString(String s) {
       //APPROACH 1
        // String str=new String();
        // for(int i=s.length()-1;i>=0;i--){
        //     char ch=s.charAt(i);
        //     str+=ch;
        // }
        // return str;
        
        //APPROACH 2
        // StringBuilder sb=new StringBuilder(s);
        // sb.reverse();
        // return sb.toString();
        
        // APPROACH 3
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
