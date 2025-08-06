class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int [] > list=new ArrayList<>();
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[0]));
        int start=0,end=0;
        
        for(int i=0;i<arr.length;i++){
            start=arr[i][0];end=arr[i][1];
            
            if(!list.isEmpty() && end<=list.get(list.size()-1)[1])
              continue;
             
          for(int j=i+1;j<arr.length;j++){
              if(end>=arr[j][0])
                  end=Math.max(end,arr[j][1]);
              else
                  break;
          }
          int li[]=new int[]{start,end};
          list.add(li);
        }
        return list;
    }
}