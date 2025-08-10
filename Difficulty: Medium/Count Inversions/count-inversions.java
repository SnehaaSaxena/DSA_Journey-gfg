class Solution {
     static int count=0;
    static int inversionCount(int arr[]) {
         //int count=0;
        // APPROACH 1 (but time limit exceed)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j])
        //          count ++;
        //     }
        // }
        // return count;
        
        //APPROACH 2
         return mergeSort(arr,0,arr.length-1);
        
    }
    static int mergeSort(int arr[],int si,int ei){
       int count=0;
        if(si>=ei){
            return count;
        }
        int mid=si+(ei-si)/2;
        count+=mergeSort(arr,si,mid);
        count+=mergeSort(arr,mid+1,ei);
        count+=merged(arr,si,mid,ei);
        return count;
    }
    static int merged(int arr[],int si,int mid,int ei){
        int count=0;
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else if (arr[i]>=arr[j]){
                count+=mid-i+1;
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
             temp[k++]=arr[i++];
        }
        while(j<=ei){
          temp[k++]=arr[j++];
        }
        for(int l=si , start=0;start<temp.length;start++){
            arr[l++]=temp[start];
        }
        return count;
    }
}