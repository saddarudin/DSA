package lab1;

import java.util.ArrayList;

public class Task_1_2 {
    public static void main(String[] args) {
        String menuTitle="My Dream Menu:";
        System.out.println("Menu Title: \n"+menuTitle);
        ArrayList<String> Menu=new ArrayList<>();
        String starter="Fries";
        Menu.add(starter);
        String mainCourse="Biryani";
        Menu.add(mainCourse);
        String dessert="Tea";
        Menu.add(dessert);
        System.out.println(Menu);

    }
}
