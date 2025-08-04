// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
    // APPROACH 1
    //     reverse(arr,0,arr.length-1);
    //     reverse(arr,0,0);
    //     reverse(arr,1,arr.length-1);
        
    // }
    // public void reverse(int arr[],int start,int end){
    //     while(start<end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    
    //APPROACH 2
    int start=arr[0];
    int i=0;
    
    for(i=arr.length-1;i>=0;i--){
        if(arr.length==1){
            break;
         }else if(i==0){
            arr[i+1]=start; 
         }else if(i==arr.length-1){
            int lp=(i+1)%arr.length;
            arr[lp]=arr[i];
        }else{
            int j=i;
            arr[++j]=arr[i];
        }
     }
    
    
    }
}