package LAB.lab4;

public class Task2Lab4 {
    public static void main(String[] args) {
        Sort s=new Sort();
        int[][] array={{2,10,15},{5,1,3},{6,9,4}};
        int[] arr=new int[array.length*array[0].length];
        int count=0;
        //Converting 2D array into 1D array
        for (int[] i : array) {
            for (int j:i) {
                arr[count] =j;
                count++;
            }
        }
        //Calling bubble sort method
        s.bubbleSort(arr);
        //printing arr after sorting
        for(int i:arr) System.out.print(i+"  ");
//        s.selectionSort(arr);
//        s.insertSort(arr);
//        s.quickSort(arr,0,arr.length-1);

    }
}
