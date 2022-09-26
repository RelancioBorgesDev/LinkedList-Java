package LinkedListClasses;

public class Node {
    protected int data;
    protected Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data= " + data +
                ", next: " + next +
                '}';
    }
}
