package lab1;

import java.util.ArrayList;

public class Task_1_2 {
    public static void main(String[] args) {

                // Create a variable called menuTitle of type String and assign it the value "My
                // Dream Menu:".
        String menuTitle="My Dream Menu:";
                // Print the menuTitle variable to the console.
        System.out.println("Menu Title: \n"+menuTitle);
                // Create a variable called menu of type ArrayList.
        ArrayList<String> Menu=new ArrayList<>();
                // Create a variable called starter of type string and pass in the name of
                // your favourite starter.
        String starter="Fries";
                // Add the starter variable to the ArrayList called menu.
        Menu.add(starter);
                // Create a variable called mainCourse of type string and pass in the name of
                // your favourite main course.
        String mainCourse="Biryani";
                // Add the mainCourse variable to the ArrayList called menu.
        Menu.add(mainCourse);
                // Create a variable called dessert of type string and pass in the name of
                // your favourite dessert.
        String dessert="Tea";
                // Add the dessert variable to the ArrayList called menu.
        Menu.add(dessert);
                // Print the menu variable to the console.
        System.out.println(Menu);

    }
}
