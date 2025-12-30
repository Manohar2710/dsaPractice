import java.util.List;

class Node {
    int data;
    Node node;

    Node(int data){
        this.data = data;
        this.node = null;
    }
}

public class LinkedListExample {

    private Node head = null;

    public void add(int num) {
        Node node = new Node(num);
        if(head == null) {
            head = node;
        } else {
            Node current = head;
            while(current.node != null){
                current = current.node;
            }
            current.node = node;
        }
    }

    public void addFirst(int num) {
        Node newHead = new Node(num);
        newHead.node = head;
        head = newHead;
    }

    @Override
    public String toString() {

        Node current = head;
        String outputValue = "";
        while (current != null){
            outputValue += " "+String.valueOf(current.data);
            current = current.node;
        }
        return outputValue;
    }

    public void delete(int i) {
        Node current = head;
        if(current.data == i ){
            head = current.node;
            return;
        }
        while(current.node != null && current.node.data != i){
            current = current.node;
        }
        if(current.node.data == i ){
            current.node = current.node.node;
        }

    }
}

