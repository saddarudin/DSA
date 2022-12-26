package classWork;

import java.util.Arrays;
import java.util.Scanner;

public class FindTarget2DArray_HW {
    int[][] a1;
    int[]   a2;
    int index;
    static int counter=0;
    FindTarget2DArray_HW(){
        a1=new int[][]{{8,-2,5},{3,1,6},{4,2,50},{69,11,9},{0,78,54},{102,-21,56},{31,58,7},{338,16,48},{77,560,840},{55,61,-500}};
        a2=new int[30];
    }
    public int[] merge(int[][] a,int rows,int columns){
        index=-1;
        int size=rows*columns;
        int[] b=new int[size];
        for(int i=0;i<columns;i++)
            for(int j=0;j<rows;j++){
                index++;
                b[index]=a[j][i];
            }
        return b;
    }
    static int bSearch(int[] a,int x){
        int p=0,q=a.length-1;
        while (p<=q){
            counter++;
            int i=(p+q)/2;
            if(a[i]==x)return i;
            else if(a[i]<x)p=i+1;
            else q=i-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        FindTarget2DArray_HW obj=new FindTarget2DArray_HW();
        obj.a2=obj.merge(obj.a1,10,3);
        System.out.println("Single dimensional array before sorting: ");
        for (int i:obj.a2) {
            System.out.print(i+"  ");
        }
        Arrays.sort(obj.a2);
        System.out.println("\n\nSingle dimensional array after sorting: ");
        for (int i:obj.a2) {
            System.out.print(i+"  ");
        }
        System.out.println("\n\nFinding target: \n");
       for(int i=0;i<3;i++){
           System.out.print("Enter target "+(i+1)+" :");
           int x=scan.nextInt();
           int index=bSearch(obj.a2,x);
           if(index<0) System.out.println("Target not found");
           else System.out.println("Target found at index: "+index+" in "+FindTarget2DArray_HW.counter+" iteration");
       }
    }
}
