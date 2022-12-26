package com.linkedList;

import java.util.Scanner;

public class LinkedList {
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
        Scanner scan=new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter any number: ");
            int n = scan.nextInt();
            Node new_node = new Node(n);
            if (head != null)
                new_node.next = head;
            head = new_node;
            System.out.println("Do you want to add more data? Press 1 to add: ");
            x=scan.nextInt();
        }while (x==1);
    }
    public void displayNode(){
        Node temp=head;
        if(head==null) System.out.println("Does not exist?");
        else {
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createNode();
        ll.displayNode();
    }
}

