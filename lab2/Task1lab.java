package lab2;

import java.util.Objects;
import java.util.Scanner;

public class Task1lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactApp app = new ContactApp();
        app.contacts[0][0] = "Saddar";
        app.contacts[0][1] = "03480331849";
        app.contacts[1][0] = "Kelash";
        app.contacts[1][1] = "03001280147";
        app.contacts[2][0] = "Mehar Ali";
        app.contacts[2][1] = "03063488379";
        app.contacts[3][0] = "Shahid Hussain";
        app.contacts[3][1] = "03248239454";
        app.contacts[4][0] = "Zohaib";
        app.contacts[4][1] = "03151345921";
        String choice;
        do {
            System.out.println("***Contact App***\n Created By \"SDB\"\n\n");
            System.out.println("1->Display All Contacts");
            System.out.println("2->Search a contact");
            System.out.println("3->Add a new contact");
            System.out.println("4->Update the contact");
            System.out.println("5->Delete any contact");
            System.out.println("0->To exit");
            choice = scan.nextLine();
            String name, number,position;
            for(int i=0;i<30;i++) System.out.println();
            switch (choice) {
                case "1" -> {
                    app.displayAllContacts();
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "2" -> {
                    System.out.print("Enter name to search: ");
                    name = scan.nextLine();
                    if (app.searchContact(name)) System.out.println("Contact Found with number "+app.contacts[ContactApp.index][1]);
                    else System.out.println("Contact not found!");
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "3" -> {
                    System.out.print("Enter number to add: ");
                    number = scan.nextLine();
                    System.out.print("Enter name to save this contact: ");
                    name = scan.nextLine();
                    System.out.print("Enter position: ");
                    position=scan.nextLine();
                    app.contacts=app.addNewContact(name, number,Integer.parseInt(position));
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "4" -> {
                    app.updateContact();
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
                case "5" -> {
                    System.out.print("Enter name to delete the contact: ");
                    name = scan.nextLine();
                    app.contacts=app.deleteContact(name);
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
            }
            for (int i=0;i<50;i++) System.out.println();
        }while (!Objects.equals(choice, "0"));
    }
}
