class Solution {
    public void mergeArrays(int a[], int b[]) {
       //APPROACH 1 (as both array are sorted so moving elem from last from array a to array b )
        int left=a.length-1, right=0;
        while(left>=0 && right<b.length){
            if(a[left]>b[right]){
                int temp=a[left];
                a[left]=b[right];
                b[right]=temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
