class Solution {
    public void mergeArrays(int a[], int b[]) {
      //APPROACH 1 (as both array are sorted so moving elem from last from array a to array b )
        // int left=a.length-1, right=0;
        // while(left>=0 && right<b.length){
        //     if(a[left]>b[right]){
        //         int temp=a[left];
        //         a[left]=b[right];
        //         b[right]=temp;
        //         left--;
        //         right++;
        //     }else{
        //         break;
        //     }
        // }
        // Arrays.sort(a);
        // Arrays.sort(b);
     
     
        //APPROACH 2
        int temp[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j])
              temp[k++]=a[i++];
            else
              temp[k++]=b[j++];
        }
        
        while(i<a.length){
            temp[k++]=a[i++];
        }
        while(j<b.length){
            temp[k++]=b[j++];
        }
        
        int count1=0,count2=0;
        for(int start=0;start<temp.length;start++){
            if(start<a.length)
              a[count1++]=temp[start];
            else{
                b[count2++]=temp[start];
            }
        }
   
    }
}
