package com.linkedList;

import java.util.Scanner;

class node1{
    int data;
    Node_1 next;
    node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class Try {
    Scanner scan=new Scanner(System.in);
    int data;
   int noOfNodes=1;
    Node_1 p;
    Node_1 start;
    public void addNode(){
        System.out.print("Enter data: ");
        data=scan.nextInt();
        p.next=new Node_1(data);
        p=p.next;
        noOfNodes++;
    }

    public int sum(){
        int sum=0;
        for(Node_1 n = start; n!=null; n=n.next) sum+=n.data;
        return sum;
    }
    public double average(){
        double average=0;
        average=(double) sum()/noOfNodes;
        return average;
    }
    public static void main(String[] args) {
        Try t=new Try();
        int yes_no;
        System.out.print("Enter data: ");
        t.data=t.scan.nextInt();
        t.p=new Node_1(t.data);
        t.start=t.p;
        do {
            System.out.print("Do you want to add more(1/0)? : ");
            yes_no = t.scan.nextInt();
            if(yes_no==1)t.addNode();
        }while (yes_no==1);
        System.out.println("Data retrieving: ");
        for(Node_1 n = t.start; n!=null; n=n.next) System.out.println(n.data);

        System.out.println("Sum = "+t.sum());
        System.out.println("Average = "+t.average());
    }
}