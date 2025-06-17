public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        Integer val = q.dequeue();
        System.out.println("Removed value: " + val);
        q.print();
        System.out.println("Length of queue: " + q.length());
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node head;
    private Node rear;
    private int size;

    Queue() {
        this.head = null;
        this.rear = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            this.head = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        size++;
    }

    Integer dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return null;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            if (head == null) {
                rear = null;
            }
            return val;
        }
    }

    void print() {
        Node temp = head;
        System.out.println("___________________");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("\n___________________");
    }

    int length() {
        return size;
    }
}
