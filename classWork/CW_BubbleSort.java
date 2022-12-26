package classWork;

public class CW_BubbleSort {
    public static void main(String[] args) {
        int[] A={10,2,8,7,6,3};
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1-i;j++){
                if(A[j]>A[j+1]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        for (int j : A) System.out.println(j);
    }
}
