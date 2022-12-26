package lab4;

public class Sort {
    public int[] bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
   public int[] selectionSort(int[] array){
        int minIndex;
        for (int i=0;i<array.length-1;i++){
            minIndex=i;
            for (int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex])minIndex=j;
                int temp=array[i];
                array[i]=array[minIndex];
                array[minIndex]=temp;
            }
        }
        return array;
   }
   public int[] insertSort(int[] array){
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
        return array;
   }
   int partition(int list[], int beg, int end){
        int pivot=list[beg];
        int lm=beg+1;
        int rm=end;
        int temp;
        do {
            while (list[rm]>pivot)rm--;
            while (list[lm]<=pivot&&lm<end)lm++;
            if(lm<rm){
                temp=list[rm];
                list[rm]=list[lm];
                list[lm]=temp;
            }
        }while (lm<rm);
        list[beg]=list[rm];
        list[rm]=pivot;
        return rm;
   }
   public int[] quickSort(int list[],int beg,int end){
        int p;
        if(beg<end){
            p=partition(list,beg,end);
            quickSort(list,beg,p-1);
            quickSort(list,p+1,end);
        }
        return list;
   }
}
