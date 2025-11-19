/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        Node dummy=new Node(0);
        Node temp=dummy;
        Node node1=reverse(head1);
        Node node2=reverse(head2);
        int carry=0;
        while(node1!=null || node2!=null){
            int v1=node1!=null ? node1.data : 0;
            int v2=node2!=null ? node2.data : 0;
            
            int sum=v1+v2+carry;
            int digit=sum%10;
            carry=sum/10;
            
            Node curr=new Node(digit);
            temp.next=curr;
            temp=temp.next; 
            
            if(node1!=null) node1=node1.next;
            if(node2!=null) node2=node2.next;
        }
        if(carry!=0){
            Node curr=new Node(carry);
            temp.next=curr;
        }
        //return reverse(dummy.next);
        Node node=reverse(dummy.next);
        while(node.data==0) node=node.next;
        return node;
      }
    public Node reverse(Node head){
        Node curr=head,prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}