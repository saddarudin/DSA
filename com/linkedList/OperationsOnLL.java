package com.linkedList;

import java.util.Scanner;

public class OperationsOnLL{
    public int size(Node head){
        int size=0;
        for(Node n=head;n!=null;n=n.next)size++;
        return size;
    }
    public Node insert(Node head,int data){
        //Data must be in ascending order
        if(head.data>data){
            Node q=new Node(data);
            q.next=head;
            head=q;
            return head;
        }
        Node n;
        for(n=head;n.next!=null;n=n.next)if(n.next.data>data)break;
        Node q=new Node(data);
        q.next=n.next;
        n.next=q;
    return head;
}
    public Node insert(Node head,int data,int position){
        if(position>(size(head)+1)||position<1)throw new IllegalArgumentException();
        if(position==1){
            Node q=new Node(data);
            q.next=head;
            head=q;
            return head;
        }
        Node n=head;
        for(int i=2;i<position;i++)n=n.next;
        Node q=new Node(data);
        q.next=n.next;
        n.next=q;
        return head;
    }
    public Node delete(Node head,int x){
        if(head==null||head.data>x)return head;
        if(head.data==x)return head.next;
        for(Node n=head;n.next!=null;n=n.next){
            if(n.next.data>x)return head;
            if(n.next.data==x){
                n.next=n.next.next;break;
            }
        }
        return head;
    }
    public Node deleteLastElement(Node head){
        if(head==null)return null;
        if(head.next==null)return null;
        Node n=head;
        while (n.next.next!=null){
            n=n.next;
        }n.next=null;
        return head;
    }
    public void printList(Node head){
        for(Node n=head;n!=null;n=n.next) System.out.print(n.data+" ");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        OperationsOnLL obj=new OperationsOnLL();
        Node head=new Node(1);
        for(int i=2;i<10;i++){
            head=obj.insert(head,i);
        }
        head=obj.deleteLastElement(head);
        obj.printList(head);
    }
}
