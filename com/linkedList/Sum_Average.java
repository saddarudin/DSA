package com.linkedList;

import java.util.Scanner;
class Node_1 {
    int data;
    Node_1 next;
    Node_1(int data){
        this.data=data;
        this.next=null;
    }
}
public class Sum_Average {
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
        double average;
        average=(double) sum()/noOfNodes;
        return average;
    }
    public static void main(String[] args) {
        Sum_Average obj=new Sum_Average();
        int yes_no;
        System.out.print("Enter data: ");
        obj.data=obj.scan.nextInt();
        obj.p=new Node_1(obj.data);
        obj.start=obj.p;
        do {
            System.out.print("Do you want to add more(1/0)? : ");
            yes_no = obj.scan.nextInt();
            if(yes_no==1)obj.addNode();
        }while (yes_no==1);
        System.out.println("Data retrieving: ");
        for(Node_1 n = obj.start; n!=null; n=n.next) System.out.println(n.data);

        System.out.println("Sum = "+obj.sum());
        System.out.println("Average = "+obj.average());
    }
}