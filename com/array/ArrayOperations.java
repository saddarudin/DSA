package com.array;

//import java.util.Scanner;

public class ArrayOperations {
    int size;
    public void traverse(int[] a){
        for (int i:a) System.out.println(i);
    }
    public int[] insert(int[] a,int x,int position){
        int index=0;
        size++;
        int[] newArray=new int[size];
        for (int i=0;i<newArray.length;i++){
            if(i==position-1)newArray[i]=x;
            else {
                newArray[i]=a[index];
                index++;
            }
        }
        return newArray;
    }
    public int search(int[] a,int target){
        for (int i=0;i<a.length;i++) if(a[i]==target)return i;
        return -1;
    }
    public int[] delete(int[] a,int target){
        int index=search(a,target);
        int[] newArray;
        if(index<0)return null;
        else{
            size--;
            int count=0;
            newArray=new int[size];
            for (int i=0;i<a.length;i++){
                if(i!=index){
                    newArray[count]=a[i];
                    count++;
                }
            }
        }
        return newArray;
    }
    public void update(int[] a,int target,int replacement){
        int index=search(a,target);
        if(index<0)return;
        a[index]=replacement;
    }
}
class Demo{
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
        ArrayOperations obj=new ArrayOperations();
        obj.size=5;
        int[] a=new int[obj.size];
        a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
        obj.update(a,0,34);
        obj.traverse(a);
    }
}
