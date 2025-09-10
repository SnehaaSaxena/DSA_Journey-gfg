// User function Template for Java
class Solution {
    String firstRepChar(String s) {
      TreeMap<String,Integer> map=new TreeMap<>();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          String str=Character.toString(ch);
          if(map.containsKey(str)) return str;
          map.put(str,map.getOrDefault(str,0)+1);
      }
        return "-1";
    }
}