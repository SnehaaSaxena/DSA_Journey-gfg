// User function Template for Java

// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
      ArrayList<Integer> list=new ArrayList<>();
      int j=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]<0)
              list.add(arr[i]);
          else
             arr[j++]=arr[i];
       }
       
       int n=arr.length;
       for(int i=n-list.size();i<n;i++){
           arr[i]=list.get(i-(n-list.size()));
       }
     
    }
}