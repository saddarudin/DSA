package lab1;

import java.util.Scanner;

//challenge 1 accepted and done
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String question="Which is correct option?";
        String choiceOne="1.Java is platform dependent";
        String choiceTwo="2.Java is not a case sensitive language.";
        String choiceThree="3.Java is platform independent";

        System.out.println(question);
        System.out.println(choiceOne+"\n"+choiceTwo+"\n"+choiceThree);
        System.out.println("Enter your choice: ");
        int choice=scan.nextInt();
        if(choice==1||choice==2) System.out.println("Your answer is not correct the correct answer is third option");
        else if(choice==3) System.out.println("Your answer is correct");

    }
}
