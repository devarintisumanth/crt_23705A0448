class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node_1 = new Node(20);
        Node node_2 = new Node(30);
        Node node_3 = new Node(40);

        head.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
