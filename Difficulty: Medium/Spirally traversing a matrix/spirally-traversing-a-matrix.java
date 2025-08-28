class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
      int startRow=0,endRow=arr.length-1,startCol=0,endCol=arr[0].length-1;
      while(startRow<=endRow && startCol<=endCol){
          
          for(int i=startCol;i<=endCol;i++)
            list.add(arr[startRow][i]);
          
          for(int i=startRow+1;i<=endRow;i++)
            list.add(arr[i][endCol]);
         
          for(int i=endCol-1;i>=startCol;i--){
            if(startRow==endRow)
              break;
            list.add(arr[endRow][i]);}
            
          for(int i=endRow-1;i>=startRow+1;i--){
             if(startCol==endCol)
               break;
             list.add(arr[i][startCol]);}
          
          startRow++;
          endRow--;
          startCol++;
          endCol--;
      
      }
       return list; 
    }
}
