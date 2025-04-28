package deki2_2425_de1.datastructure;

public class MyLinkedListQueue implements MyQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }

    @Override
    public void enqueue(int element) {
        /* TODO */
        Node newNode = new Node(element);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public int dequeue() {
        /* TODO */
        if(head == null){
            return -1;
        }else{
            int element = head.data;
            head = head.next;
            return element;
        }
    }

    @Override
    public int peek() {
        /* TODO */
        if(head == null){
            return -1;
        }else{
            return head.data;
        }
    }

    @Override
    public boolean isEmpty() {
        /* TODO */
        return head == null;
    }

}

