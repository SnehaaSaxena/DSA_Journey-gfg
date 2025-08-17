// User function Template for Java

class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,  List<Integer> arr3) {
     Set<Integer> set1=new HashSet<>(arr1);
     Set<Integer> set2=new HashSet<>(arr2);
     Set<Integer> set3=new TreeSet<>(arr3);
     ArrayList<Integer> list=new ArrayList<>();
     
     for(int key:set3){
         if(set1.contains(key) && set2.contains(key))
            list.add(key);
     }
     return list;
   }
}