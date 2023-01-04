package com.array;

import java.util.Arrays;
import java.util.Random;

public class IsSorted_IsDescendingMethods {
    public static boolean isSorted(int[] array){
        return isDescending(array) || isAscending(array);
    }
    public static boolean isDescending(int[] array){
        for (int i=0;i<array.length-1;i++)if(array[i]<array[i+1])return false;
        return true;
    }
    public static boolean isAscending(int[] array){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1])return false;
        }
        return true;
    }
public static void main(String[] args) {

    int[] array=new int[100];
    Random random=new Random();
    for(int i=0;i<100;i++)array[i]=random.nextInt(50);
    for(int i:array) System.out.print(i+" ");
    System.out.println("\n"+isSorted(array));
    Arrays.sort(array);
    System.out.println(isSorted(array));
    for(int i:array) System.out.print(i+" ");

}
}
