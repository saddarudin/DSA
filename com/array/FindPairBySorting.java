package com.array;

import java.util.Arrays;

public class FindPairBySorting {
    public static void main(String[] args) {
        int[] a={ 8, 7, 2, 5, 3, 1 };
        Arrays.sort(a);
        int target=10;
        int min=0;
        int max=a.length-1;
        while (min<max){
            if(a[min]+a[max]==target){
                System.out.println("("+a[min]+","+a[max]+")");
                return;
            }
            else if(a[min]+a[max]<target)min++;
            else max--;
        }
        System.out.println("no pair found");
    }
}
