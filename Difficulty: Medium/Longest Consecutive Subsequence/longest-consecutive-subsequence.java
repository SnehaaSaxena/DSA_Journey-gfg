class Solution {
 // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
    //     Arrays.sort(arr);
    //     int count=1, maxCount=0;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]+1==arr[i+1])
    //         count++;
    //         else if(arr[i]==arr[i+1])
    //          continue;
    //         else{
    //           maxCount=Math.max(maxCount,count);
    //           count=1;
    //         }
    //      }
    //   maxCount=Math.max(maxCount,count); 
    //   return maxCount; 
    // }
    
    
    //APPROACH 2
    int count=1, maxCount=1;
    Set<Integer> set=new TreeSet<>();
    for(int i:arr){
        set.add(i);
    }
    for(Integer num:set){
        if(set.contains(num+1))
            count++;
        else{
            maxCount=Math.max(maxCount,count);  
            count=1; 
        }
     }
     return maxCount;
  }
}

