class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        int mid=(int)Math.floor((s.size()+1)/2.0);
        midElement(s,mid);
    }
    public void midElement(Stack<Integer> s, int mid){
        if(s.size()==mid){
            s.pop();
            return;
        }
        int top=s.pop();
        midElement(s,mid);
        s.push(top);
     }
}