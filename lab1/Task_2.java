package lab1;

import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=scan.nextInt();
        int price;
        if(age>0&&age<=13)price=5;
        else if (age>13&& age<65)price=10;
        else price=7;
        System.out.println("Ticket price for you is $"+price);
    }
}
