package com.linkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CreatingLL {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int data;
        int yes_no;
        System.out.print("Enter data: ");
        data=scan.nextInt();
        Node start;
        Node p=new Node(data);
        start=p;
        System.out.print("Do you want to add more data: (1/0)?");
        yes_no=scan.nextInt();
        while (yes_no==1){
            System.out.print("Enter data: ");
            data=scan.nextInt();
            p.next=new Node(data);
            p=p.next;
            System.out.print("Do you want to add more data: (1/0)?");
            yes_no=scan.nextInt();
        }
        System.out.println("Retrieving Data: ");
        for(Node node=start;node!=null;node=node.next) System.out.println(node.data);
    }
}
