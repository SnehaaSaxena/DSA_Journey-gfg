// User function Template for Java

class Solution {
    int[][] sortedMatrix(int N, int arr[][]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                list.add(arr[i][j]);
            }
        }
        int k=0;
        Collections.sort(list);
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=list.get(k);
                k++;
            }
        }
        return arr;
    }
};