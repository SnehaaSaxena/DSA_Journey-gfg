/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        Node temp=head;
        Node next=head.next;
        while(next!=null){
            if(temp.data==next.data){
               temp.next=temp.next.next;
               next=temp.next;
            }else{
                temp=next;
                next=next.next;
            }
        }
        return head;
    }
}