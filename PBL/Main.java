package PBL;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    //University array has been created to store universities' objects
    University[] universities=new University[100];//values
    //String array to store keys of every object of university
    String[] keys=new String[100];

    //Constructor to fetch data from csv file to University array
    //and txt file to keys array
    Main(){
        //Reading from csv file and txt file
        File file=new File("PBL/Top 100 Unis of Pakistan.csv");
        File file1=new File("PBL/Keys.txt");
        try {
            int i=0;
            Scanner scan = new Scanner(file);
            Scanner scanner=new Scanner(file1);
            while (scan.hasNextLine()){
                String[] parts= scan.nextLine().split(",");
                universities[i]=new University(parts[0],Integer.parseInt(parts[1]),
                        Integer.parseInt(parts[2]),Integer.parseInt(parts[3]),
                        parts[4],Integer.parseInt(parts[5]));
                keys[i]=scanner.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        insertIntoMap();
        insertIntoStack("noOfPublications");
        insertIntoStack("PakRanking");
    }

    //Hashmap: to store data in key value pair
    private static final MyHashmap map=new MyHashmap(100);
    //to insert data into hashmap and also return map
    public void insertIntoMap(){
        for(int i=0;i<100;i++)map.put(keys[i],universities[i]);
    }
    public static MyHashmap getMap(){return map;}
    //stack1 for storing data order by noOfPublication
    private static final MyLinkedStack stack1=new MyLinkedStack();
    //stack2 for storing data order by PakRanking
    private static final MyLinkedStack stack2=new MyLinkedStack();

    public void insertIntoStack(String orderBy){
        if(orderBy.equals("noOfPublications")) stack1.push(keys,universities,orderBy);
        else if(orderBy.equals("PakRanking")) stack2.push(keys,universities,orderBy);
    }
    public static MyLinkedStack getStack1(){return stack1;}
    public static MyLinkedStack getStack2(){return stack2;}
}
