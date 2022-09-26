package LinkedListClasses;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    private boolean isHeadNull(){
        return head == null;
    }

    public void append(int data){
        if(isHeadNull()){
            head = new Node(data);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void prepend(int data){
        if(isHeadNull()){
            head = new Node(data);
        }else{
            Node oldHead = head;
            Node newHead = new Node(data);
            head = newHead;
            newHead.next = oldHead;
        }
    }

    public void insert(int index, int data){
        int pos = 0;
        Node current = head;
        while(current != null){
            if(pos - index == -1){
                Node noAntigo = current.next;
                Node novoNo = new Node(data);
                current.next = novoNo;
                novoNo.next = noAntigo;
                break;
            }
            current = current.next;
            pos += 1;
        }
    }
    public boolean isValueInList(int data){
        Node current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size(){
        int size = 0;
        Node current = head;

        while(current != null){
            current = current.next;
            size += 1;
        }
        return size;
    }

    public Object getFirst(){
        return !(head == null) ? head.data: null;
    }

    public Object getLast(){
       if(head == null){
           return null;
       }
       Node current = head;
       while(current.next != null){
           current = current.next;
       }
       return current.data;
    }

    public int removeFirst(){
        Node current = head;
        head = head.next;
        return current.data;
    }
    public int removeLast(){
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        Node second_last = current;
        Node last = current.next;
        second_last.next = null;

        return last.data;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head= " + head +
                '}';
    }
}
