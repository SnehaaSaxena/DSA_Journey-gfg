// User function Template for Java
class Solution {
    char firstRep(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if(arr[i]==arr[j])  return arr[i];
                 else  j++;
            }
        }
        return '#';
    }
}