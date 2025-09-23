class Solution {
    public boolean areIsomorphic(String s1, String s2) {
   // Brute force approach
    for(int i=0;i<s1.length();i++){
        char ch1=s1.charAt(i);
        char ch2=s2.charAt(i);
        for(int j=0;j<s1.length();j++){
            if(s1.charAt(j)==ch1 && s2.charAt(j)!=ch2) return false;
            if(s1.charAt(j)!=ch1 && s2.charAt(j)==ch2) return false;
        }
    }
    return true;
    
    
    //   HashMap<Character,Character> map=new HashMap<>();
    //   for(int i=0;i<s1.length();i++){
    //       char original=s1.charAt(i);
    //       char replacement=s2.charAt(i);
    //       if(!map.containsKey(original)){
    //           if(!map.containsValue(replacement))
    //             map.put(original,replacement);
    //           else
    //             return false;
    //       }else{
    //           if(map.get(original)!=replacement) return false;
    //       }
    //   }
    //   return true;
    }
}
