class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        //APPROACH 1 (COUNT SORT)
        int max=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2)
              list.add(i);
        }
        return list;
        
    }
}