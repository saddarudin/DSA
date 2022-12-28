package LAB.lab4;

public class Sort {
    public void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
   public void selectionSort(int[] array){
        int minIndex;
        for (int i=0;i<array.length-1;i++){
            minIndex=i;
            for (int j=i+1;j<array.length;j++)
                if(array[j]<array[minIndex])minIndex=j;
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
        }
   }
   public void insertSort(int[] array){
        int current;
        int j;
        for (int i=1;i<array.length;i++){
            current=array[i];
            j=i-1;
            while (j>=0&& array[j]>current){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
   }
   int partition(int[] array, int beg, int end){
        int pivot=array[beg];
        int lm=beg+1;
        int rm=end;
        int temp;
        do {
            while (array[rm]>pivot)rm--;
            while (array[lm]<=pivot&&lm<end)lm++;
            if(lm<rm){
                temp=array[rm];
                array[rm]=array[lm];
                array[lm]=temp;
            }
        }while (lm<rm);
        array[beg]=array[rm];
        array[rm]=pivot;
        return rm;
   }
   public void quickSort(int[] array, int beg, int end){
        int p;
        if(beg<end){
            p=partition(array,beg,end);
            quickSort(array,beg,p-1);
            quickSort(array,p+1,end);
        }
   }
}
