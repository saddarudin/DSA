package lab4;

public class Task2Lab4 {
    public static void main(String[] args) {
        Sort s=new Sort();
        int[][] array={{2,10,15},{5,1,3},{6,9,4}};
        int[] arr=new int[array.length*array[0].length];
        int[] temp;
        int count=-1;
        System.out.println("Converting 2D array  into 1D array");
        for (int i = 0; i <array.length; i++) {
            for (int j=0;j<array[0].length;j++){
                count++;
                arr[count]=array[i][j];
            }
        }
        System.out.println("Before sorting: ");
        for (int i:arr) System.out.print("  " +i);
        System.out.println("\nThis is Bubble sort: ");
        temp=s.bubbleSort(arr);
        for (int i: temp) System.out.print("  "+i);
        System.out.println("\nThis is Selection sort: ");
        temp=s.selectionSort(arr);
        for (int i:temp) System.out.print("  "+i);
        System.out.println("\nThis is Insertion sort: " );
        temp=s.insertSort(arr);
        for (int i: temp) System.out.print("  "+i);
        System.out.println("\nThis is Quick sort");
        temp=s.quickSort(arr,0,arr.length-1);
        for (int i :temp)System.out.print("  "+i);
    }
}
