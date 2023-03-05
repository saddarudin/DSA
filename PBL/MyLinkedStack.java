package PBL;

import java.util.EmptyStackException;

class MyLinkedStack {
    private static class Node{
        String data;
        Node next;
        public Node(String  data,Node n){
            this.data=data;
            this.next=n;
        }
    }
    private Node top;
    private int size;
    public boolean isEmpty(){
        return size==0;
    }
    public int size() {
        return size;
    }

    public void push(String  data) {
        top=new Node(data,top);
        size++;
    }
    public String pop() {
        if(isEmpty())throw new EmptyStackException();
        String temp=top.data;
        top=top.next;
        size--;
        return temp;
    }
    public String peak() {
        if(isEmpty())throw new EmptyStackException();
        return top.data;
    }
    public void push(String[] keys,University[] universities,String orderBy){
        if(orderBy.equals("noOfPublications")){
            //fetching map from Main class to get university of associated key
            MyHashmap map=Main.getMap();
            //loop to take one by one key and compare and store in stack
            for(int i=0;i<100;i++){
                String key=keys[i];
                University university=universities[i];
                if(isEmpty())top=new Node(key,top);
                else {
                    int j=university.getNoOfPublications();//j is no of publications for ith university
                    university=(University) map.get(top.data);//get university from top of stack
                    //no of publications of the university on the top of stack is less than that
                    // of university whose key is to be inserted into stack
                    if(university.getNoOfPublications()<j)  top=new Node(key,top);
                    else {
                        Node temp=top;
                        while (temp.next!=null){
                            university=(University) map.get(temp.next.data);
                            int k=university.getNoOfPublications();//k is no of publications of the university taken from stack
                            if(j>k)break;
                            temp=temp.next;
                        }
                        Node n=new Node(key,null);
                        n.next=temp.next;
                        temp.next=n;
                    }

                }
                size++;

            }
        }
        else if(orderBy.equals("PakRanking")){
            MyHashmap map=Main.getMap();
            for(int i=0;i<100;i++){
                String key=keys[i];
                University university=universities[i];
                if(isEmpty())top=new Node(key,top);
                else {
                    int j=university.getPakRanking();
                    university=map.get(top.data);
                    if(university.getPakRanking()>j)  top=new Node(key,top);
                    else {
                        Node temp=top;
                        while (temp.next!=null){
                            university=map.get(temp.next.data);
                            int k=university.getPakRanking();
                            if(j<k)break;
                            temp=temp.next;
                        }
                        Node n=new Node(key,null);
                        n.next=temp.next;
                        temp.next=n;
                    }

                }
                size++;

            }
        }

    }
    public void traverse(){
        for(Node n=top;n!=null;n=n.next) System.out.println(Main.getMap().get(n.data));
    }

}

