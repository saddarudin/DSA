package lab2;

import java.util.Scanner;

public class FireAir {
    Scanner scan=new Scanner(System.in);
    int size=5;
    static int index;
    String[][] songs=new String[size][2];
    public void printAllSongs(){
        System.out.println("Song#        song\n");
        for (String[] song:songs) {
            System.out.println(song[0]+"            "+song[1]);
        }
    }
    public String[][] addNewSong(String song,int position){
        String[][] add=new String[songs.length+1][2];
        size++;
        int count=-1;
        for (int i=0;i< songs.length+1;i++){
            if(i==position){
                add[position][0]=String.valueOf(position+1);
                add[position][1]=song;
            }else{
                count++;
                add[i][0]=songs[count][0];
                add[i][1]=songs[count][1];
            }

        }
        return add;
    }

    public boolean searchSong(String song){
        index=-1;
        for (String[] strings : songs){
            index++;
            if (song.equals(strings[1]) || song.equals(strings[0])) return true;
        }
        return false;
    }
    public String[][] deleteSong(int number){
        size--;
        int count=-1;
        String[][] delete=new String[size][2];
        if(searchSong(String.valueOf(number))){
            for (int i = 0; i <delete.length+1; i++) {
                if(i!=number-1){
                    count++;
                    delete[count][0]=songs[i][0];
                    delete[count][1]=songs[i][1];
                }
            }
        }else System.out.println("Song with this serial number not found");
        return delete;
    }
    public void updateSong(String song){
        if(searchSong(song)){
            System.out.println("1->Update serial number\n2->Update name");
            String update=scan.nextLine();
            if(update.equals("1")){
                System.out.print("Enter new number to change the previous number: ");
                update=scan.nextLine();
                songs[index][0]=update;
            } else if (update.equals("2")) {

                System.out.print("Enter new name to change the previous name: ");
                update=scan.nextLine();
                songs[index][1]=update;
            }
            System.out.println("Song updates successfully.");
        }
        else System.out.println("Song not found!");
    }
}
