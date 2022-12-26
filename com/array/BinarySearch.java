package com.array;

public class BinarySearch {
    public int binarySearch(int[] a,int target){
        int p=0, q=a.length-1;
        int mid;
        while (p<=q){
            mid=(p+q)/2;
            if(a[mid]==target)return mid;
            else if (a[mid]>target)q=mid-1;
            else p=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a={-10,0,20,30,40,50,60,65,700};
        BinarySearch obj=new BinarySearch();
        System.out.println(obj.binarySearch(a,40));
    }
}
