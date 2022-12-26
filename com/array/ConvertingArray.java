package com.array;

public class ConvertingArray {
    int[][] a={{1,2},{3,4},{5,6},{7,8}};;
    int[] b=new int[a.length*a[0].length];
    public void convert(int[][] a){
        int index=0;
        for (int[] i : a) {
            for (int k : i) {
                b[index] = k;
                index++;
            }
        }
    }
    public static void main(String[] args) {
        ConvertingArray obj=new ConvertingArray();
        obj.convert(obj.a);
        for(int i: obj.b) System.out.print("  "+i);

    }
}
