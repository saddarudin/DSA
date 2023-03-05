package PBL;
public class University {
    private String name,location;
    private int worldRanking,asiaRanking,pakRanking,noOfPublications;

    public University(String name,int worldRanking,int asiaRanking,int pakRanking,String location,int noOfPublications){
        this.name=name;
        this.worldRanking=worldRanking;
        this.asiaRanking=asiaRanking;
        this.pakRanking=pakRanking;
        this.location=location;
        this.noOfPublications=noOfPublications;
    }

    public University(){

    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getWorldRanking() {
        return worldRanking;
    }

    public int getAsiaRanking() {
        return asiaRanking;
    }

    public int getPakRanking() {
        return pakRanking;
    }

    public int getNoOfPublications() {
        return noOfPublications;
    }

    @Override
    public String toString() {
        return worldRanking+"       "+asiaRanking+"     "+pakRanking+"      "+noOfPublications+"        "+location+"        "+name;
    }
}
