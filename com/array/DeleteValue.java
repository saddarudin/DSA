package com.array;

import java.util.Scanner;

public class DeleteValue {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,50,60,70};
        int[] b=new int[6];
        System.out.println("Enter index to delete value: ");
        Scanner scan=new Scanner(System.in);
        int index=scan.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(i==index){
                continue;
            }
            b[count]=a[i];
            ++count;
        }

        for(int j:b) System.out.println(j);
    }
}
