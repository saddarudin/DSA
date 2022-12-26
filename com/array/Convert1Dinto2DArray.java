package com.array;

public class Convert1Dinto2DArray {
    int[] a={1,2,3,4,5};
    String[] s={"Saddar","Zohaib","Mehar","Hassan","Kelash"};
    String[][] myClass=new String[5][2];
    public void convert(){
        for(int i=0;i<a.length;i++){
            myClass[i][0]=String.valueOf(a[i]);
            myClass[i][1]=s[i];
        }
    }

    public static void main(String[] args) {
        Convert1Dinto2DArray obj=new Convert1Dinto2DArray();
        obj.convert();
        System.out.println("Roll#      Name");
        for (String[] i:obj.myClass) System.out.println(i[0]+"          "+i[1]);
    }
}
