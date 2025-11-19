/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node node=reverse(head);
        int carry=1;
        while(node!=null){
            int val=node!=null ? node.data : 0;
            int sum=val+carry;
            int digit=sum%10;
            carry=sum/10;
            Node curr=new Node(digit);
            temp.next=curr;
            temp=temp.next;
            if(node!=null) node=node.next;
        }
        if(carry>0){
            Node curr=new Node(carry);
            temp.next=curr;
        }
        return reverse(dummy.next);
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