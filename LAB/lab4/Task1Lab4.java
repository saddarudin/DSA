package LAB.lab4;

public class Task1Lab4 {
    public static void main(String[] args) {
        Sort s=new Sort();
        int[] array={180,165,150,170,145};
        long before1=System.nanoTime();
        s.bubbleSort(array);
        long after1=System.nanoTime();
        System.out.println("Execution time of bubble sort: "+(after1-before1));
        for(int i:array) System.out.print(i+" ");
    }
}
