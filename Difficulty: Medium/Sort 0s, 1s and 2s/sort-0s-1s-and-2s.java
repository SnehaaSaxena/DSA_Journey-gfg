class Solution {
    public void sort012(int[] arr) {
        // code here
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        int j=0;
        for(int i:map.keySet()){
            int value=map.get(i);
            while(value>0){
                arr[j]=i;
                j++;
                value--;
            }
        }
    }
}