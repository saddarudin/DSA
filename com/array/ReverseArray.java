package com.array;

import java.util.Random;

public class ReverseArray {
    public static void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[20];
        for(int i=0;i<array.length;i++)array[i]=random.nextInt(100);
        System.out.println("Before Reversing: ");
        for(int i:array) System.out.print(i+" ");
        reverse(array);
        System.out.println("\nAfter Reversing");
        for(int i:array) System.out.print(i+" ");


    }
}
