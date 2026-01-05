package sortingExamples.treeEx;

public class BinarySearchTree {
    Node root;
    public void insert(int i) {
        root = insertRec(root, i);

    }

    public Node insertRec(Node newNode, int i) {
        if(newNode == null)
            newNode = new Node(i);
        else if( i < newNode.data)
            newNode.left = insertRec(newNode.left, i);
        else if( i > newNode.data)
            newNode.right = insertRec(newNode.right, i);

        return newNode;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if(root != null) {
            inOrderRec(root.left);
            System.out.print(root.data+ " ");
            inOrderRec(root.right);
        }
    }
    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if(root != null) {
            System.out.print(root.data+ " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if(root != null) {

            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data+ " ");
        }
    }
}
