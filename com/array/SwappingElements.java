package com.array;

public class SwappingElements {
    public void swap(int[] a,int index1,int index2){
        int x=a[index1];
        a[index1]=a[index2];
        a[index2]=x;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        SwappingElements obj=new SwappingElements();
        obj.swap(a,1,3);
        for (int i:a) System.out.println(i);
    }
}
