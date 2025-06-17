import java.util.LinkedList;

public class InsertAtBeginning {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);

        list.addFirst(10);  // Insert 10 at the beginning

        System.out.println("LinkedList after insertion at beginning: " + list);
    }
}