class Solution {
    public void rearrange(int arr[]) {
        int nums[]= Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(nums);
        int i=0,j=nums.length-1,k=0;
        while(i<=j){
            if(i==j){
              arr[k++]=nums[i];
              i++;j--;
            }
            else{
              arr[k++]=nums[j];
              arr[k++]=nums[i];
              i++;j--;
            }
         }
      }
}
