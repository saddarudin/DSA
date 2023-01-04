package classWork;

public class Test1_2 {
    /*
    Single linkedList/Array {29,35,45,55,65,75,95};
    Find the mid and last element
     */
    public static void main(String[] args) {
        System.out.println("***********LinkedList*************");
        Node start=new Node(29);
        start.next=new Node(35);
        start.next.next=new Node(45);
        start.next.next.next=new Node(55);
        start.next.next.next.next=new Node(65);
        start.next.next.next.next.next=new Node(75);
        start.next.next.next.next.next.next=new Node(95);
        int mid=0;
        Node p=start;
        for(int i=1;i<7;i++){
            p=p.next;
            if(i==3)mid=p.data;
        }
        System.out.println("Mid element is: "+mid+"\nLast element is: "+p.data);
        System.out.println("***********Array*************");
        int[] a={29,35,45,55,65,75,95};
        System.out.println("Mid element is: "+a[(a.length-1)/2]+"\nLast element is: "+a[a.length-1]);
    }
}
