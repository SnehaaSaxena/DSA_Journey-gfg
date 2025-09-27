class Solution {
    public static boolean searchPattern(String txt, String pat) {
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<txt.length()){
            if(txt.charAt(i)==pat.charAt(j)){
            sb.setLength(0);
            int index=i;
            while(i<txt.length() && j<pat.length() && txt.charAt(i)==pat.charAt(j)){
                sb.append(txt.charAt(i));
                i++;
                j++;
            }
            if(sb.toString().equals(pat)) return true;
            else{
               j=0;
               i=index+1;
            } 
          }else{
              i++;
          }
        }
       return false; 
    }
}
