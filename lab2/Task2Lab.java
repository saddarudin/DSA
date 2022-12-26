package lab2;

import java.util.Objects;
import java.util.Scanner;

public class Task2Lab {
    public static void main(String[] args) {
        FireAir obj=new FireAir();
        String[] songs={"A dil he mushkil","Channa mere aa","Mehfil me teri hum na rahe jo","Agar tum saath ho"};
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
            for(int i=0;i<30;i++) System.out.println();
            switch (choice) {
                case "1" -> {
                    obj.printAllSongs(songs);
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "2" -> {
                    System.out.print("Enter song name to add: ");
                    String name=scan.nextLine();
                    System.out.print("Enter position: ");
                    String position=scan.nextLine();
                    songs=obj.addNewSong(songs,name,Integer.parseInt(position));
                    System.out.println("New song added successfully.");
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "3" -> {
                    System.out.print("Enter serial number of the song to delete: ");
                    String sNo = scan.nextLine();
                    songs=obj.deleteSong(songs,Integer.parseInt(sNo));
                    System.out.println("deleted successfully.");
                    System.out.print("Press any key");
                    String temp=scan.nextLine();
                }
                case "4" -> {
                    System.out.print("Enter name of the song: ");
                    String name = scan.nextLine();
                    int index= obj.searchSong(songs,name);
                    if(index>=0) System.out.println("Serial number: "+(index+1)+" Song: "+songs[index]);
                    else System.out.println("Song not found!");
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
                case "5" -> {
                    System.out.print("Enter name of the song to update : ");
                    String name = scan.nextLine();
                    obj.updateSong(songs,name);
                    System.out.print("Press any key");
                    String temp = scan.nextLine();
                }
            }
            for (int i=0;i<50;i++) System.out.println();
        }while (!Objects.equals(choice, "0"));
    }
}
