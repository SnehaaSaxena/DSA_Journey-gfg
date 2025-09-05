class Solution {
    boolean isPalindrome(String s) {
        
        // APPROACH 1
        // String str=new String();
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     st.push(ch);
        // }
        // while(!st.isEmpty()){
        //     str+=st.pop();
        // }
        // return s.equals(str);
        
        //APPROACH 2
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
              return false;
              i++;
              j--;
        }
        return true;
    }
}