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


        // two pointer approach
          int top=0,down=mat.length-1;
          while(top<down){
              if(mat[top][down]==1) top++; //if a person knows someone then he is not the celebrity so move down
              else if(mat[down][top]==1) down--; //if a person knows someone then he is not the celebrity so move up
              else{ // this is case where neither of them can be a celebrity as to be a celebrity everyone should know them but here for each of them 1-1 person is reduced
                  top++;
                  down--;
              }
          }
          for(int i=0;i<mat[top].length;i++){
              if(top==i) continue;
              else if(mat[top][i]==0 && mat[i][top]==1);
              else return -1;
          }
          return top;
    } 
}
