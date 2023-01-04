package com.array;

import java.util.Random;

public class FrequencyMethod {
    public static int frequency(int[] array,int value){
        int count=0;
        for (int j : array) if (j == value) count++;
        return count;
    }

    public static void main(String[] args) {
        int[] array=new int[100];
        Random random=new Random();
        for(int i=0;i< array.length;i++)array[i]=random.nextInt(50);
        for(int i:array) System.out.print(i+" ");
        System.out.println("Frequency of 34 is "+frequency(array,34));
    }
}
