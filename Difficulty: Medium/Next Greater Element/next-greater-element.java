class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) list.add(-1);
            else list.add(arr[st.peek()]);
            st.push(i);
        }
        Collections.reverse(list);
        return list;

    }
}