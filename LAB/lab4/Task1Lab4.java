package lab4;

public class Task1Lab4 {
    public static void main(String[] args) {
        Sort s=new Sort();
        int[] array={180,165,150,170,145};
        int[] temp;
        System.out.println("\nBefore Sorting");
        for (int i:array) System.out.print("  "+i);
        long before1=System.nanoTime();
        temp=s.bubbleSort(array);
        System.out.println("hsbshdbvhdzvjbscbj");
        for (int i:array) System.out.print("  "+i);

        long after1=System.nanoTime();
        System.out.println("\nThis is bubble sort: ");
        for (int i:temp) System.out.print("  "+i);
        System.out.println("\nExecution time in milli seconds: "+(after1-before1));
        System.out.println("\nThis is Selection Sort");
        long before2=System.nanoTime();
        temp=s.selectionSort(array);
        long after2=System.nanoTime();
        for (int i:temp) System.out.print(" "+i);
        System.out.println("\nExecution time in milli seconds: "+(after2-before2));
        System.out.println("\nThis is Insertion sort");
        long before3=System.nanoTime();
        temp=s.insertSort(array);
        long after3=System.nanoTime();
        for (int i:temp) System.out.print("  "+i);
        System.out.println("\nExecution time in milli seconds: "+(after3-before3));
        System.out.println("\nThis is quick sort: ");
        long before4=System.nanoTime();
        temp=s.quickSort(array,0,array.length-1);
        long after4=System.nanoTime();
        for (int i:temp) System.out.print("  "+i);
        System.out.println("\nExecution time in milli seconds: "+(after4-before4));
    }
}
