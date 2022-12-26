package classWork;

public class HW_3DArray {
    public static void main(String[] args) {
        int[] Maths={90,91,89,90,64,75,84,45,88,71};
        int[] OOP={94,90,91,88,75,80,89,67,94,77};
        int[] PP={78,69,77,34,56,88,91,88,71,89};
        int[][] myClass=new int[10][3];
        //Insertion
        for(int i=0;i<10;i++){
            myClass[i][0]=Maths[i];
            myClass[i][1]=OOP[i];
            myClass[i][2]=PP[i];
        }
        //Sorting
        System.out.println("Roll#\tMaths\t\tOOP\t\t\tPP");
        for(int i=0;i<10;i++){
            System.out.print(i+1);
            for (int j=0;j<3;j++) System.out.print("\t\t"+myClass[i][j]+"\t");
            System.out.println();
        }
    }
}
