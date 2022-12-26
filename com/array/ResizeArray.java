package com.array;

public class ResizeArray {
    public int[] resize(int[] a,int newSize){
        if(newSize<a.length)throw new IllegalArgumentException();
        int[] newArray=new int[newSize];
        System.arraycopy(a, 0, newArray, 0, a.length);
        return newArray;
    }

    public static void main(String[] args) {
        ResizeArray obj=new ResizeArray();
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println(a.length);
        a=obj.resize(a,11);
        System.out.println(a.length);
    }
}
