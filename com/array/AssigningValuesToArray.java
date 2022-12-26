package com.array;

import java.util.Scanner;

public class AssigningValuesToArray {
    public static void main(String[] args) {
        //Array can be declared by "type name[];" OR type[] name;
        int[] a;

        //it can be initialized by
        a=new int[5];
        //size is mandatory


        //array can be assigned by
        //int[] a={1,2,3,4};
        //OR int[] a=new a[]{2,3,4};
        //OR by
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;



        //for printing values we use loop
        for (int i:a) {
            System.out.println(i);
        }




//        array can be assigned by user
        Scanner scan=new Scanner(System.in);
        for (int j=0;j<a.length;j++) {
            System.out.println("Enter value "+(j+1)+": ");
            a[j]=scan.nextInt();
        }

        System.out.println("new values are: ");
        for (int k:a) {
            System.out.println(k);
        }
    }
}
