// User function Template for Java

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node findFirstNode(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
               break;
            }
        }
         if(slow!=fast){
              return null;
         }
            slow=head;
              while(slow!=fast){
                fast=fast.next;
                slow=slow.next;
               }
             return slow;
        }
}