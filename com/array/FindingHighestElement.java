package com.array;

public class FindingHighestElement {
    public int highest(int[] a){
        int x=0;
        for (int i=1;i<a.length;i++){
            if(a[i]>a[x])x=i;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] a={1,2,4,5,6,10,15,0,-5,710,45,34,77};
        FindingHighestElement obj=new FindingHighestElement();
        System.out.println(obj.highest(a));
    }
}
