package com.array;

public class ArraySorting {
    public void printArray(int[] array){
        for(int i:array) System.out.print(i+"  ");
    }
    public void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public void selectionSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<array.length;j++){
                if(array[smallest]>array[j])
                    smallest=j;
            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;
        }
    }
    public void insertionSort(int[] array){
        for(int i=1;i<array.length;i++){
            int current=array[i];
            int j=i-1;
            while (j>=0 && current<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
    }
    public int partition(int[] array,int low,int high){
        int pivot=array[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(array[j]<pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp=array[i];
        array[i]=array[high];
        array[high]=temp;
        return i;
    }
    public void quickSort(int[] array,int low,int high){
        if(low<high){
            int pivotIndex=partition(array,low,high);
            quickSort(array,low,pivotIndex-1);
            quickSort(array,pivotIndex+1,high);
        }
    }
    public static void main(String[] args) {
        ArraySorting obj=new ArraySorting();
        int[] array={2,8,0,-5,4,7,9,11,34,21,3};
        long before=System.nanoTime();
        obj.bubbleSort(array);
        long after=System.nanoTime();
        System.out.println("\n"+(after-before)+"\n");
        obj.printArray(array);
    }
}
