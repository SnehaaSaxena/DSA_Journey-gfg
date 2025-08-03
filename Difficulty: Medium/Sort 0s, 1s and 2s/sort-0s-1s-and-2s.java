class Solution {
    public void sort012(int[] arr) {
       //APPROACH 1
        // TreeMap<Integer,Integer> map=new TreeMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // int j=0;
        // for(int i:map.keySet()){
        //     int value=map.get(i);
        //     while(value>0){
        //         arr[j]=i;
        //         j++;
        //         value--;
        //     }
        // }
        
        //APPROACH 2
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=arr[i]>max ? arr[i] : max;
        }
        
        int freq[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                arr[j]=i;
                j++;
                freq[i]--;
            }
        }
    }
}
