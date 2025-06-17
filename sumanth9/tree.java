class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class tree {
    Node root;
    int index = -1;

    tree(int[] nodes) {
        this.root = buildTreeUsingArray(nodes);
    }

    public Node buildTreeUsingArray(int[] nodes) {
        index++;
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTreeUsingArray(nodes);
        newNode.right = buildTreeUsingArray(nodes);
        return newNode;
    }
    public void preOrder() {
        preOrderHelper(root);
        System.out.println();
    }

    private void preOrderHelper(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }
    public void inOrder() {
        inOrderHelper(root);
        System.out.println();
    }

    private void inOrderHelper(Node node) {
        if (node == null) return;
        inOrderHelper(node.left);
        System.out.print(node.data + " ");
        inOrderHelper(node.right);
    }
    public void postOrder() {
        postOrderHelper(root);
        System.out.println();
    }

    private void postOrderHelper(Node node) {
        if (node == null) return;
        postOrderHelper(node.left);
        postOrderHelper(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        tree t = new tree(new int[]{1, 2, -1, -1, 3, -1, -1});

        System.out.print("Preorder traversal: ");
        t.preOrder();

        System.out.print("Inorder traversal: ");
        t.inOrder();

        System.out.print("Postorder traversal: ");
        t.postOrder();
    }
}