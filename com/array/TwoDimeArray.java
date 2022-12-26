package com.array;

import java.util.Scanner;

public class TwoDimeArray {
    public static void main(String[] args) {
        //declared as
        int[][] a;
        //initialized as
        a=new int[3][3];
        //can be assigned
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter value: ");
                a[i][j]=scan.nextInt();
            }
        }


        System.out.println("Values are: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
    }

}
