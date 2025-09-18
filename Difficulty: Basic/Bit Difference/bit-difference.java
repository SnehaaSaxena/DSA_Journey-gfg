class Solution {
    public static int countBitsFlip(int a, int b) {
        // int num=a^b;
        // int count=0;
        // while(num!=0){
        //   count++;
        //   num=num & num-1;
        // }
        // return count;
        
        // ANOTHER WAY
        int num=a^b;
        int count=0;
        while(num>0){
          int x=num%2;
          if(x==1){
            count++;
           }
           num=num/2;
           if(num==1){
               count++;
               break;
            }  
        }
       return count; 
    }
}
