package classWork;


class Person{
    String name;
}
class Student extends Person{
    int roll;
    Student(){}
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
}
public class HW_ClassArray {
    public static void main(String[] args) {
        Person[] p=new Person[6];
        Student student1=new Student("Saddar",77);
        Student student2=new Student("Ali",80);
        Student student3=new Student("Zohaib",21);
        Student student4=new Student("Mehar",58);
        Student student5=new Student("Kelash",52);
        Student student6=new Student("Shahid",46);
        p[0]=student1;
        p[1]=student2;
        p[2]=student3;
        p[3]=student4;
        p[4]=student5;
        p[5]=student6;
    }
}
