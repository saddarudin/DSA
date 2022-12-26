package LAB.lab3;

public class Task_1 {
    int[] a={1,2,3,4,5};
    public  void insert(int element,int position){
        int[] b=new int[a.length+1];
        if(position==0){
            b[0]=element;
            for (int i=0;i<a.length;i++){
                b[i+1]=a[i];
            }
        }
        else if(position==a.length){
            b[a.length]=element;
            for (int i=0;i<a.length;i++)b[i]=a[i];
        }
        else {
            int count=-1;
            for (int i=0;i<b.length;i++){
                if(i==position)b[position]=element;
                else{
                    count++;
                    b[i]=a[count];
                }
            }
        }
        for (int i:b) System.out.println(i);

    }

    public static void main(String[] args) {
        new Task_1().insert(10,0);
    }
}
