package com.linkedList;

import java.util.Scanner;

public class CreatingLLByMethod {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node p;
    public static void addNode(){
        Scanner scan=new Scanner(System.in);
        int data;
        System.out.print("Enter data: ");
        data=scan.nextInt();
        CreatingLLByMethod.p.next=new Node(data);
        CreatingLLByMethod.p= CreatingLLByMethod.p.next;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int yes_no;
        int data;
        System.out.print("Enter data: ");
        data=scan.nextInt();
        Node start;
        p=new Node(data);
        start=p;
        do {
            System.out.print("Do you want to add more(1/0)? : ");
            yes_no = scan.nextInt();
            if(yes_no==1)addNode();
        }while (yes_no==1);

        System.out.println("Traversing LL\n");
        for(Node node=start;node!=null;node=node.next) System.out.println(node.data);
    }
}