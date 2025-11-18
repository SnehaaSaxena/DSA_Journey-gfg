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
        Node curr=head;
            while(curr.next!=null){
               while(curr.data==curr.next.data){
                 curr.next=curr.next.next;
                 if(curr.next==null) break;
               }
                  if(curr.next!=null)
                  curr=curr.next;
                  else break;
            }
           
        
       return head; 
    }
}