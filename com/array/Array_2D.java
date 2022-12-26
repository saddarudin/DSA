package com.array;

public class Array_2D {
    static int size=5;
    public void traverse(int[][] a){
        for (int[] i : a){
            for (int j : i) System.out.print("     " + j);
            System.out.println();
        }

    }
    public boolean search(int[][] a,int target){
        for (int[] i:a)
//            if(i[1]==target)return true; //->searching in particular column
            for (int j:i)if(j==target)return true;
        return false;
    }
    public void update(int[][] a,int target,int replacement){
            for (int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    if(a[i][j]==target){
                        a[i][j]=replacement;
                        break;
                    }
                }
            }
    }

    public static void main(String[] args) {

        int[][] a=new int[size][3];
        a[0][0]=1;
        a[0][1]=18;
        a[0][2]=1000;
        a[1][0]=2;
        a[1][1]=19;
        a[1][2]=2000;
        a[2][0]=3;
        a[2][1]=18;
        a[2][2]=10000;
        a[3][0]=4;
        a[3][1]=20;
        a[3][2]=1000;
        a[4][0]=5;
        a[4][1]=17;
        a[4][2]=1000;
        Array_2D obj=new Array_2D();
        obj.update(a,1,34);
        obj.traverse(a);
    }
}
