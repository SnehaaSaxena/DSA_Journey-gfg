class Solution {
    public static int kthSmallest(int[] arr, int k) {
       //APPROACH 1
          //Arrays.sort(arr);
          //return arr[k-1];
       
       
       //APPROACH 2
          //   int max=Integer.MIN_VALUE;
          //   for(int i=0;i<arr.length;i++){
          //       max=arr[i]>max ? arr[i]:max;
          //   }
          //   int freq[]=new int[max+1];
          //   for(int i=0;i<arr.length;i++){
          //       freq[arr[i]]++;
          //   }
          //   for(int i=0;i<freq.length;i++){
          //       if(freq[i]>0){
          //           k--;
          //           if(k==0)
          //              return i;
          //       }
          //   }
          //   return -1;
          
       
       //APPROACH 3
       Arrays.sort(arr);
       int start=arr[0],end=arr[arr.length-1];
       while(start<=end){
          int mid=start+(end-start)/2;
          int lesserElem=findLesserElem(arr,mid);
          if(lesserElem<k)
            start=mid+1;
          else
            end=mid-1;
        }
      return start; 
    }  
    public static int findLesserElem(int arr[], int num){
        int lesserElem=0;
       int start=0,end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]<=num)
             start=mid+1;
           else
             end=mid-1;
       }
       lesserElem+=start;
       return lesserElem;
    }
}
