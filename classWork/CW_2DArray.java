package classWork;

public class CW_2DArray {
    public static void main(String[] args) {
        int[] roll=new int[45];
        String[] name=new String[45];
        for(int i=0;i<45;i++){
            roll[i]=i+1;
            name[i]="A"+i;
        }
        String[][] myClass=new String[45][2];
        for(int i=0;i<45;i++){
            myClass[i][0]=roll.toString();
            myClass[i][1]=name[i];
        }
        for(int i=0;i<45;i++)
            for(int j=0;j<2;j++) System.out.println(myClass[i][j]);
        System.out.println();
    }
}
