package lab2;

import java.util.Scanner;

public class FireAir {
    Scanner scan=new Scanner(System.in);
    public void printAllSongs(String[] songs){
        System.out.println("Song#        song\n");
        for (int i=0;i<songs.length;i++) System.out.println((i+1)+"->"+songs[i]);
    }
    public String[] addNewSong(String[] songs, String song,int position){
        String[] add=new String[songs.length+1];
        int count=0;
        if(position>0 && position<=add.length) {
            for (int i = 0; i < add.length; i++) {
                if ((i + 1) == position)
                    add[i] = song;
                else {
                    add[i] = songs[count];
                    count++;
                }
            }
        }else{
            System.out.print("Incorrect position");
            return songs;
        }
        return add;
    }
    public int searchSong(String[] songs, String song){
        for (int i=0;i<songs.length;i++)
            if (song.equals(songs[i])) return i;
        return -1;
    }
    public String[] deleteSong(String[] songs,int sNo){
        String[] delete=new String[songs.length-1];
        int count=0;
        if(sNo>0 && sNo<=songs.length){
            for (int i=0;i<songs.length;i++){
                if((i+1)!=sNo){
                    delete[count]=songs[i];
                    count++;
                }
            }
        }else{
            System.out.println("This serial number does not exist!");
            return songs;
        }
        return delete;
    }
    public void updateSong(String[] songs,String song){
        int index=searchSong(songs,song);
        if(index>=0){
            System.out.print("Enter new song name: ");
            String newName=scan.nextLine();
            songs[index]=newName;
        }else System.out.println("Song not found!");
    }
}
