// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<arr.length;i++){
             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         if(map.containsKey(0) && map.get(0)<2)
            map.remove(0);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(-arr[i])){
                ArrayList<Integer> li=new ArrayList<>();
                li.add(Math.min(arr[i],-arr[i]));
                li.add(Math.max(arr[i],-arr[i]));
                list.add(li);
                map.remove(arr[i]);
                map.remove(-arr[i]);
            }
        }
        return list;
    }
}
