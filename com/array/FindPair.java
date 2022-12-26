package com.array;

public class FindPair {
    public static void main(String[] args) {
        /*
        Find pairs whose sum = target
        note reverse is not allowed that is if one pair is (8,2) then (2,8) is not allowed
         */
        int[] a={8,7,2,5,3,1,9};
        int target=10;
        int x=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("("+a[i]+","+a[j]+")");
                    x=10;
                }
            }
        }
        if(x!=10) System.out.println("No pair found");
    }
}
