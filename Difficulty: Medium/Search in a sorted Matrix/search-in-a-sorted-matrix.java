class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        int row=mat.length-1,col=0;
        while(row>=0 && col<mat[0].length){
            if(mat[row][col]==x) return true;
            else if(x < mat[row][col])  row--;
            else col++;
        }
        return false;
    }
}
