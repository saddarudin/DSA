package com.array;

import java.util.Scanner;

public class ArrayOfMNLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int x=scan.nextInt();
        System.out.println("Enter no of columns: ");
        int y=scan.nextInt();
        int[][] a=new int[x][y];
        for(int i=0;i<x;i++){
            System.out.println("Enter "+y+" values for row "+(i+1)+": ");
            for(int j=0;j<y;j++)
                a[i][j]=scan.nextInt();
            System.out.println();
        }

        //reading values
        System.out.println("Values are: ");
        for(int[] i:a){
            for(int j:i) System.out.print(j+"  ");
            System.out.println();
        }

    }
}
