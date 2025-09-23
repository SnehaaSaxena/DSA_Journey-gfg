class Solution {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,  List<Integer> arr3) {
    //  Set<Integer> set1=new HashSet<>(arr1);
    //  Set<Integer> set2=new HashSet<>(arr2);
    //  Set<Integer> set3=new TreeSet<>(arr3);
    //  ArrayList<Integer> list=new ArrayList<>();
     
    //  for(int key:set3){
    //      if(set1.contains(key) && set2.contains(key))
    //         list.add(key);
    //  }
    //  return list;
    
    //APPROACH 2
    int i=0,j=0,k=0;
    ArrayList<Integer> list=new ArrayList<>();
    while(i<arr1.size() && j<arr2.size() && k<arr3.size()){
        int min=Math.min(arr1.get(i),Math.min(arr2.get(j),arr3.get(k)));
        
        if(arr1.get(i).equals(min) && arr2.get(j).equals(min) && arr3.get(k).equals(min))
          list.add(min);
          
        if(arr1.get(i).equals(min)){
           while(i<arr1.size() && arr1.get(i).equals(min))  // while loop exist to check for duplicate values
             i++;
        }
         if(arr2.get(j).equals(min)){
           while(j<arr2.size() && arr2.get(j).equals(min)) 
             j++;
        }
         if(arr3.get(k).equals(min)){
           while(k<arr3.size() && arr3.get(k).equals(min)) 
             k++;
        }
    }
    return list;
   }
}
