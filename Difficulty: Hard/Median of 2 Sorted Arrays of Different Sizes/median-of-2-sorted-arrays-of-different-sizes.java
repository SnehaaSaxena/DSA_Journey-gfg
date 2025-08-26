class Solution {
    public double medianOf2(int a[], int b[]) {
       int temp[]=new int[a.length+b.length];
       int k=0;
       for(int i=0;i<a.length;i++){
           temp[k++]=a[i];
       }
        for(int i=0;i<b.length;i++){
           temp[k++]=b[i];
       }
       Arrays.sort(temp);
       if(temp.length%2==0)
        return (double)(temp[temp.length/2]+temp[temp.length/2-1])/2;
        else
         return (double)temp[temp.length/2];
    }
}