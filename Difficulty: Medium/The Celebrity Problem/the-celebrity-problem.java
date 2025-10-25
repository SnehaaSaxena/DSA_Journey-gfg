class Solution {
    public int celebrity(int mat[][]) {
        int iKnow[]=new int[mat.length];
        int knowMe[]=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    iKnow[i]++;
                    knowMe[j]++;
                } 
            }
        }
        for(int i=0;i<knowMe.length;i++){
            if((knowMe[i]==mat.length-1 && iKnow[i]==0)||
            (knowMe[i]==mat.length && iKnow[i]==1) ) return i;
        }
      return -1;  
    }
}