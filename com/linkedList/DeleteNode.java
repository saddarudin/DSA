package com.linkedList;

import java.util.Scanner;

public class DeleteNode {
    Scanner scan=new Scanner(System.in);
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void createNode(){
        System.out.println("Enter data: ");
        Node newNode=new Node(scan.nextInt());
        if(head!=null)newNode.next=head;
        head=newNode;
        System.out.println("Do you want to add more: Press one to add");
        if(scan.nextInt()==1)createNode();
    }
    void showNode(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    void deleteNode(){
        Node temp=head;
        head=temp.next;
    }

    void deleteLastNode() {
        Node temp = head;
        Node temp1 = temp.next;
        while (temp1.next!=null){
            temp=temp1;
            temp1=temp.next;
        }
        temp.next=null;
    }
    void deleteParticular(){
        System.out.println("Enter position: ");
        int position=scan.nextInt();
        Node temp=head;
        Node ptr=temp.next;
        for(int i=2;i<position;i++){
            temp=ptr;
            ptr=temp.next;
        }
        temp.next=ptr.next;

    }

    public static void main(String[] args) {
        DeleteNode dn=new DeleteNode();
        dn.createNode();
        dn.showNode();
        dn.deleteNode();
        System.out.println("After deleting");
        dn.showNode();
        System.out.println("Deleting last node...");
        dn.deleteLastNode();
        System.out.println("After deleting");
        dn.showNode();
        dn.deleteParticular();
        dn.showNode();
    }
}
