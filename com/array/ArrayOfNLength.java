package com.array;

import java.util.Scanner;

public class ArrayOfNLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=scan.nextInt();
        int[] a=new int[n];
        System.out.println("Enter values: ");
        for(int i=0;i<n;i++)
            a[i]=scan.nextInt();
        System.out.println("Values you entered are: \n");
        for(int j:a)
            System.out.println(j);

    }
}
