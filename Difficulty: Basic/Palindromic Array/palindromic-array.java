/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
       int rev=0,digit=0,temp=0;
       for(int i=0;i<arr.length;i++){
           temp=arr[i];
           rev=0;
          while(temp!=0){
            digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
           }
           if(rev!=arr[i])
             return false;
       }
       return true;
    }
}