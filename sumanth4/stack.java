public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(20);
        myStack.push(10);
        myStack.push(40);
        myStack.push(30);
        myStack.push(50);
        myStack.push(20);  // This should print "stack is full"
        
        myStack.print();
        myStack.print();
        
        System.out.println("The peak value: " + myStack.peak());
    }
}

class Stack {
    int[] stack;
    int size;
    int top;

    Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return true;
        }
        return false;
    }

    void push(int val) {
        if (isFull()) {
            return;
        }
        top++;
        stack[top] = val;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int val = stack[top];
        top--;
        return val;
    }

    int peak() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(" " + stack[i] + " ");
        }
        System.out.println("___________");
    }
}
