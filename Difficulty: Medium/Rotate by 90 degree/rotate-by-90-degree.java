// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
       for(int i=0;i<mat.length;i++){
           for(int j=i+1;j<mat[i].length;j++){
               int temp=mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp;
           }
       }
       for(int i=0;i<mat.length;i++){
           int start=0,end=mat[0].length-1;
           while(start<end){
             int temp=mat[i][start];
             mat[i][start]=mat[i][end];
             mat[i][end]=temp;
             start++;
             end--;
           }
        }
     }
}