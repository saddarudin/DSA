package com.linkedList;

import java.util.Scanner;
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class SearchTarget {
    Node2 p;
    Node2 start;
    void insert(Node2 start, int n){
        p=start;
        while (p.next!=null){
            if(p.next.data>n)break;
            p=p.next;
        }
        p.next=new Node2(n);
    }
    Boolean search(Node2 start,int target){
        if(start==null||start.data>target)return false;
        if (start.data==target)return true;
        for (Node2 p=start;p.next!=null;p=p.next){
            if(p.next.data>target)return false;
            if(p.next.data==target)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SearchTarget obj=new SearchTarget();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter data: ");
        int data=scan.nextInt();
//        obj.p=new Node2(data);
        obj.p=new Node2(data);
        obj.start=obj.p;

        for (int i=1;i<10;i++){
            System.out.print("Enter data: ");
            data=scan.nextInt();
            obj.insert(obj.p,data);
        }
        System.out.println("Enter value to search: ");
        data=scan.nextInt();
        if(obj.search(obj.start,data)) System.out.println(" Found");
        else System.out.println("Not found");

    }
}
