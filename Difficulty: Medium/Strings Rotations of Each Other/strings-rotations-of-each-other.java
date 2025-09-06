class Solution {
    public boolean areRotations(String s1, String s2) {
    //     StringBuilder str1=new StringBuilder(s1);
    //     StringBuilder str2=new StringBuilder(s2);
    //     int rotations=0;
    //     while(rotations<str1.length()){
    //         if(str1.toString().equals(str2.toString()))
    //           return true;
    //          str1.append(str1.charAt(0));
    //          str1.deleteCharAt(0);
    //          rotations++;
    //     }
    //   return false; 
    
    // ANOTHER WAY
       String doubleS1=s1+s1;
       //return doubleS1.contains(s2);
       return doubleS1.lastIndexOf(s2)>=0;
    }
}