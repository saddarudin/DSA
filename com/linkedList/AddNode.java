package com.linkedList;

import java.util.Scanner;

public class AddNode {
    Scanner scan=new Scanner(System.in);
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    void createNode(){
//        Node temp=head;
        char ch;
        do {
            System.out.print("Enter data: ");
            int data= scan.nextInt();
            Node newNode = new Node(data);
            if (head != null) newNode.next = head;
            head = newNode;
            System.out.println("Do you want to add more?(y/n)");
            ch=scan.next().charAt(0);
        }while (ch=='y');
    }
    void showNode() {
        Node temp = head;
        while ((temp != null)) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    void add(){
        System.out.println("Press:\n1->To add node from starting\n2->To add node at the end\n3->To add at specific position");
        int choice=scan.nextInt();
        System.out.print("Enter data: ");
        int data= scan.nextInt();
        Node newNode=new Node(data);
        switch (choice){
            case 1->{
                newNode.next=head;
                head=newNode;
            }
            case 2->{
                Node temp=head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            case 3->{
                System.out.print("Enter position: ");
                int position=scan.nextInt();
                if(position==1){
                    newNode.next=head;
                    head=newNode;
                }else{
                    Node temp=head;
                    for(int i=2;i<position;i++)temp=temp.next;
                    newNode.next=temp.next;
                    temp.next=newNode;
                }
            }
        }
    }
    public static void main(String[] args) {
        AddNode add=new AddNode();
        Scanner scan=new Scanner(System.in);
        add.createNode();
        add.showNode();
        add.add();
        do {
            System.out.println("Press 1 to continue 0 to exit: ");
            add.add();
        }
        while (scan.nextInt()==1);
        add.showNode();
    }
}
