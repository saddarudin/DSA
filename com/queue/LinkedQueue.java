package com.queue;
import javax.management.openmbean.InvalidOpenTypeException;

public class LinkedQueue {
    private static class Node{
         Object data;
         Node next=this;
         Node pre=this;
        public Node(Object data){this.data=data;}
        public Node(Object data, Node pre, Node next){
            this.data=data;
            this.pre=pre;
            this.next=next;
        }
    }
    private int size=0;
    private final Node head=new Node(null);
    public void add(Object data) {
        head.pre.next=new Node(data,head.pre,head);
        head.pre=head.pre.next;
        size++;
    }

    public Object remove() {
        if(isEmpty())throw new InvalidOpenTypeException("Queue is empty!");
        Object temp=head.next.data;
        head.next=head.next.next;
        size--;
        return temp;
    }
    public Object first() {
        if(isEmpty())throw new InvalidOpenTypeException("Queue is empty!");
        return head.next.data;
    }

    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }


    public static void main(String[] args) {
        LinkedQueue queue=new LinkedQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Remove method "+queue.remove());
        System.out.println("Size method "+queue.size());
        System.out.println("First method "+queue.first());
    }

}