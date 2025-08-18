// class Solution {
//     public void rearrange(int arr[]) {
//         int nums[]= Arrays.copyOfRange(arr, 0, arr.length);
//         Arrays.sort(nums);
//         int i=0,j=nums.length-1,k=0;
//         while(i<=j){
//             if(i==j){
//               arr[k++]=nums[i];
//               i++;j--;
//             }
//             else{
//               arr[k++]=nums[j];
//               arr[k++]=nums[i];
//               i++;j--;
//             }
//          }
//       }
// }

// APPROACH 2 (full explanantion in notes)
// [1,2,3,4,5,6] -> MAX value element-even index and MIN value element-odd index
class Solution {
    public void rearrange(int arr[]) {
        Arrays.sort(arr);
        int max_index=arr.length-1, min_index=0, max=arr[arr.length-1]+1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=(arr[max_index]%max)*max+arr[i];
                max_index--;
            }else{
                 arr[i]=(arr[min_index]%max)*max+arr[i];
                 min_index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]/=max;
        }
      }
}