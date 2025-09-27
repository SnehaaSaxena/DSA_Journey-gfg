class Solution {
    int findFrequency(int arr[], int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
         return map.get(x)==null ? 0: map.get(x);
    }
}