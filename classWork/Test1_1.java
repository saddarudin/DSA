package classWork;

public class Test1_1 {
    /*
    Two linked lists/arrays {5,7,9,11}&{29,35,45} are populated
    Make their sum and find the highest among them.
     */
    public static void main(String[] args) {
        System.out.println("**************LinkedList****************");
        Node head=new Node(5);
        head.next=new Node(7);
        head.next.next=new Node(9);
        head.next.next.next=new Node(11);
        Node start=new Node(29);
        start.next=new Node(35);
        start.next.next=new Node(45);
        int sum=0;
        int highest=head.data;
        for(Node n=head;n!=null;n=n.next){
            sum+=n.data;
            if(n.data>highest)highest=n.data;
        }
        System.out.println("Sum of first node is: "+sum+"\nHighest element is: "+highest);
        sum=0;
        highest=start.data;
        for(Node n=start;n!=null;n=n.next){
            sum+=n.data;
            if(n.data>highest)highest=n.data;
        }
        System.out.println("Sum of second node is: "+sum+"\nHighest element is: "+highest);

        System.out.println("**************Array****************");
        int[] a={5,7,9,11};
        int[] b={29,35,45};
        sum=0;
        highest=a[0];
        for (int j : a) {
            sum += j;
            if (j > highest) highest = j;
        }
        System.out.println("Sum of first array is: "+sum+"\nHighest element is: "+highest);
        sum=0;
        highest=a[0];
        for (int j : b) {
            sum += j;
            if (j > highest) highest = j;
        }
        System.out.println("Sum of second array is: "+sum+"\nHighest element is: "+highest);


    }
}
