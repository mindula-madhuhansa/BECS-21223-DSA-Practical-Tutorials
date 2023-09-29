public class IntTree {
    private IntNode root;

    IntTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private IntNode insert(IntNode node, int data) {
        if (node == null) {
            node = new IntNode(data);
        } else {
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(IntNode r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(IntNode r) {
        if (r != null) {
            inOrder(r.left);
            System.out.print(r.data + " ");
            inOrder(r.right);
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(IntNode r) {
        if (r != null) {
            postOrder(r.left);
            postOrder(r.right);
            System.out.print(r.data + " ");
        }
    }
}
