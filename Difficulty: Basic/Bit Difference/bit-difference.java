class Solution {
    public static int countBitsFlip(int a, int b) {
        int num=a^b;
        int count=0;
        while(num!=0){
           count++;
           num=num & num-1;
        }
        return count;
    }
}
