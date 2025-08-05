class Solution {
    public static int firstRepeated(int[] arr) {
      LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
      int res=0;
      for(int i=0;i<arr.length;i++){
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      
      for(int key:map.keySet()){
          if(map.get(key)>1){
               res=key;
              break;
          }
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]==res)
            return i+1;
      }
       return -1; 
    }
}
