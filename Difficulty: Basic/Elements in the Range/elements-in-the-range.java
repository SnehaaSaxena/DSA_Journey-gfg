// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        for(int i=A;i<=B;i++){
            boolean found=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                } 
            }
            if(!found) return false;
        }
        return true;
        
    }
}
