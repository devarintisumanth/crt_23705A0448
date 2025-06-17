import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);

        list.addLast(10); 

        System.out.println("LinkedList after insertion at End: " + list);
    }
}