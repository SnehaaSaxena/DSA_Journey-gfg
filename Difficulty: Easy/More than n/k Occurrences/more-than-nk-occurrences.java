class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
       
        // int max=0;
        // for(int i=0;i<arr.length;i++){
        //   max=Math.max(max,arr[i]);
        // }
        
        // int freq[]=new int[max+1];
        // for(int i=0;i<arr.length;i++){
        //     freq[arr[i]]++;
        // }
        
        // int n=arr.length,count=0;
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]>n/k)
        //       count++;
        // }
        // return count;
        
        //APPROACH 2
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int n=arr.length,count=0;
        for(int key:map.keySet()){
            if(map.get(key)>n/k)
              count++;
        }
        return count;
    }
}