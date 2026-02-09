// User function Template for Java

class Solution {
    public static String reverseString(String s) {
         //    String str="";
        //   for(int i=s.length()-1;i>=0;i--){
        //       str+=s.charAt(i);
        //   }
        //   return str; 
        
        // 2nd APPROACH(STRING BUILDER METHOD)
        // StringBuilder sb=new StringBuilder(s);
        //     return sb.reverse().toString();
        
        // 3rd APPROACH (STACK)
        // String res="";
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     st.push(s.charAt(i));
        // }
        // while(!st.isEmpty()){
        //     res+=st.pop();
        // }
        // return res;
        
        
        //4th APPROACH (TO CHAR ARRAY)
        char str[]=s.toCharArray();
        String res="";
        for(int i=str.length-1;i>=0;i--){
            res+=str[i];
        }
        return res;
    }
}
