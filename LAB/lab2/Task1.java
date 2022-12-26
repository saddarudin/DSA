package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
//    int[] a;

    Scanner scan=new Scanner(System.in);
    int size=0;
    int[] a;
    public int[] arrayInput(){
        System.out.print("Enter size: ");
        size=scan.nextInt();
       a=new int[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            a[i]=scan.nextInt();
        }
        return a;
    }

    public void showArray(int[] a){
        for (int i:a) System.out.println(i);
    }

    public boolean searchElement(){
        System.out.print("Enter element: ");
        int element=scan.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++){
            if(element==a[i]){
                found=true;
                break;
            }else found=false;
        }
        return found;
    }


    public int[] deleteElement(){
        int[] delete=new int[size-1];
        System.out.print("Enter element to delete: ");
        int x=scan.nextInt();
        int count=0;
        try{
            for (int i=0;i<size;i++){
                if(x!=a[i])
                    delete[count]=a[i];
                count++;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return delete;
    }

    public static void main(String[] args) {
        Task1 t=new Task1();
        int[] a=t.arrayInput();
        t.showArray(a);
        System.out.println(t.searchElement());
        int[] delete=t.deleteElement();
        System.out.println(Arrays.toString(delete));
    }
}
