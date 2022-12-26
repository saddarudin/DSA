package com.array;

import java.util.Scanner;

public class AddNewElementAtParticularIndex {
    public static void main(String[] args) {
        //Let the array is
        int[] a=new int[]{10,20,30,40,50};
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter index number to insert value: ");
        int index=scan.nextInt();
        System.out.print("Enter value to be inserted: ");
        int value=scan.nextInt();


        //we will create new array with length one greater than given array
        int[] b=new int[6];

        //we will run loop for one greater than the given array because the new array has length 1 greater
        for(int i=0;i<6;i++){
            if(i<index)b[i]=a[i];
            else if(i==index)b[i]=value;
            else b[i]=a[i-1]; //because value of that index of a has not been inserted into b before and forward
        }

        //now printing new array
        for(int i:b)
            System.out.println(i);
    }
}
