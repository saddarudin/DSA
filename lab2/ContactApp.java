package lab2;

import java.util.Scanner;

public class ContactApp {
    Scanner scan=new Scanner(System.in);
    static int size=5;
//    long[] mobileNo=new long[size];
    String[][] contacts=new String[size][2];
    static int index;
    void displayAllContacts(){
        System.out.println("Name    Mobile Number");
        for (String[] contact : contacts) {
            System.out.println(contact[0] + "    " + contact[1]);
        }
    }
    boolean searchContact(String name){
        index=-1;
        boolean found=false;
        for (String[] contact : contacts) {
            index++;
            if (name.equals(contact[0])) {
                found = true;
                break;
            }
        }
        return found;
    }

    String[][] addNewContact(String name,String mobile,int position){
        String[][] array=new String[contacts.length+1][2];
        try{
            size++;
            int count=-1;
            for (int i=0;i<size;i++){
                if(i==position){
                    array[position][0]=name;
                    array[position][1]=mobile;
                }
                else{
                    count++;
                    array[i][0]=contacts[count][0];
                    array[i][1]=contacts[count][1];
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Storage is full!");
        }

        return array;
    }
    void updateContact() {
        System.out.println("Enter name of contact you want to update: ");
        String name1=scan.nextLine();
        if(searchContact(name1)){
            System.out.println("1->Change name: \n2->Change mobile number: ");
            String choice=scan.nextLine();
            if(choice.equals("1")){
                System.out.print("Enter new name: ");
                String updatedName=scan.nextLine();
                contacts[index][0]=updatedName;
            }else if(choice.equals("2")){
                System.out.print("Enter new number: ");
                String no= scan.nextLine();
                contacts[index][1]=no;
            }
        }else System.out.println("Contact not found! ");

    }

    String[][] deleteContact(String name){
        String[][] delete=new String[contacts.length-1][2];
        int count=-1;
        if(searchContact(name)){
            for (int i=0;i<contacts.length;i++) if(i==index)continue;
            else {
                count++;
                delete[count][0]=contacts[i][0];
                delete[count][1]=contacts[i][1];
            }

        }else System.out.println("Contact not found!");
        size--;
        return delete;
    }
}