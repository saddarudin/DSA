package lab2;

import java.util.Objects;
import java.util.Scanner;

public class Task2Lab {
    public static void main(String[] args) {
        lab2.FireAir obj=new lab2.FireAir();
        obj.songs=new String[obj.size][2];
        obj.songs[0][0]="1";
        obj.songs[0][1]="Song1";
        obj.songs[1][0]="2";
        obj.songs[1][1]="Song2";
        obj.songs[2][0]="3";
        obj.songs[2][1]="Song3";
        obj.songs[3][0]="4";
        obj.songs[3][1]="Song4";
        obj.songs[4][0]="5";
        obj.songs[4][1]="Song5";

        Scanner scan=new Scanner(System.in);
        String choice;
        do {
            System.out.println("*** Music Player ***\n Created By \"SDB\"\n\n");
            System.out.println("1->Display All Songs");
            System.out.println("2->Add a new song");
            System.out.println("3->Delete a song");
            System.out.println("4->Searching a song");
            System.out.println("5->Update a song");
            System.out.println("0->To exit");
            choice = scan.nextLine();
            String name, number,position;
            for(int i=0;i<30;i++) System.out.println();
            switch (choice) {
                case "1" -> {
                    obj.printAllSongs();
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "2" -> {
                    System.out.print("Enter song name to add: ");
                    name=scan.nextLine();
                    System.out.print("Enter position: ");
                    position=scan.nextLine();
                    obj.songs=obj.addNewSong(name,Integer.parseInt(position));
                    System.out.println("New song added successfully.");
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "3" -> {
                    System.out.print("Enter serial number of the song to delete: ");
                    name = scan.nextLine();
                    obj.songs=obj.deleteSong(Integer.parseInt(name));
                    System.out.println("Song with Serial number "+name+" deleted successfully.");
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "4" -> {
                    System.out.print("1->Search by serial number: \n2->Search by song name: \n");
                    number = scan.nextLine();
                    if (number.equals("1")) {
                        System.out.print("Enter serial number: ");
                        name = scan.nextLine();
                        if (obj.searchSong(name))
                            System.out.println("Song with serial number " + name + " is " + obj.songs[FireAir.index][1]);
                        else System.out.println("Song not found!");
                    } else if (number.equals("2")) {
                        System.out.print("Enter name of the song: ");
                        name = scan.nextLine();
                        if (obj.searchSong(name))
                            System.out.println("Song with name " + name + " is found Its serial number is " + obj.songs[FireAir.index][0]);
                        else System.out.println("Song not found!");
                    }
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
                case "5" -> {
                    System.out.print("Enter serial number or name of the song to update : ");
                    name = scan.nextLine();
                    obj.updateSong(name);
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
            }
            for (int i=0;i<50;i++) System.out.println();
        }while (!Objects.equals(choice, "0"));
    }
}
