class Solution {
    public boolean areIsomorphic(String s1, String s2) {
      HashMap<Character,Character> map=new HashMap<>();
      for(int i=0;i<s1.length();i++){
          char original=s1.charAt(i);
          char replacement=s2.charAt(i);
          if(!map.containsKey(original)){
              if(!map.containsValue(replacement))
                map.put(original,replacement);
              else
                return false;
          }else{
              if(map.get(original)!=replacement) return false;
          }
      }
      return true;
    }
}