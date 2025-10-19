class Solution {
    public String reverse(String S) {
       String s=new String();
       Stack<Character> st=new Stack<>();
       for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           st.push(ch);
       }
       while(!st.isEmpty()){
           s+=st.pop();
       }
       return s;
    }
}