/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Node i=new Node(0);
        i.next=head;
        Node j=head;
        while(j!=null){
            if(map.containsKey(j.data)){
                j=j.next;
                i.next=j;
            }else{
                map.put(j.data,map.getOrDefault(j.data,0)+1);
                j=j.next;
                i=i.next;
            }
        }
       return head; 
    }
}