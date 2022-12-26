package classWork;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList_HW {
    public static void main(String[] args) {
        int i=2;
        Node head;
        Node newNode=new Node(i);
        head=newNode;
        for(int j=2;j<11;j++){
            newNode.next=new Node(i*j);
            newNode=newNode.next;
        }
        for (Node node=head;node!=null;node=node.next) {
            System.out.println(node.data);
        }

    }
}
