package sortingExamples.treeEx;

public class TreeExample {
    public void runExample() {
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.insert(8);
        searchTree.insert(7);
        searchTree.insert(12);
        searchTree.insert(15);
        searchTree.insert(2);
        searchTree.insert(5);
        searchTree.postOrder();

    }
}
