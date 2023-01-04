package classWork;
class Node1{
    String word;
    int count;
    Node1 next;
    public Node1(String word){
        this.word=word;
    }
    public Node1(String word,int count){
        this.word=word;
        this.count=count;
    }
}
public class HW_Task {
    public static void main(String[] args) {
        String[] str = {"I", "Love", "My", "University", "I", "Have", "Been", "Studying", "In", "This", "University", "Since",
                "The", "Last", "Twelve", "Months", "And", "Those", "Months", "Have", "Been", "The", "Best", "Of", "My", "Life", "The", "University",
                "Is", "Providing", "Me", "A", "Platform", "To", "Strengthen", "My", "Skills", "And", "Make", "A", "Way", "For", "My",
                "Better", "Future", "I", "Will", "Keep", "Loving", "My", "University", "For", "The", "Rest", "Of", "My", "Life"};
        Node1 head1 = new Node1(str[0]);
        Node1 head2 = new Node1("", 0);
        Node1 l = head2;
        Node1 p=head1;


        //Insertion
        for (int i = 1; i < str.length; i++){
            p.next=new Node1(str[i]);
            p=p.next;
        }

        outer:
        for (Node1 n = head1; n != null; n = n.next) {//selecting each word
            for (p = head2; p != null; p = p.next) //for checking whether this word is present in LL2?
                if (n.word.equals(p.word))continue outer;//if value is present don't move below

            int count = 1;
            for (Node1 m = n.next; m != null; m = m.next) //for counting repetition of the word
                if (m.word.equals(n.word)) count++;
            if (count > 1){
                l.next = new Node1(n.word, count);
                l=l.next;
            }
        }

        System.out.println("Link List 1");
        for(Node1 n=head1;n!=null;n=n.next) System.out.print(n.word+" ");
        System.out.println("\n\nLinked List 2\n");
        System.out.println("Word      Repeated");
        for(Node1 n=head2.next;n!=null;n=n.next) System.out.println(n.count+"         "+n.word);
    }

}
