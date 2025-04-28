package deki2_2425_de1.datastructure;

/**
 * Stack sử dụng cấu trúc dữ liệu linked list.
 */
public class MyLinkedListStack implements MyStack {
    private Node top;

    @Override
    public void push(int value) {
        /* TODO */
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }

    @Override
    public int pop() {
        /* TODO */
        if (top == null) {
            return -1;
        }else{
            int value = top.data;
            top = top.next;
            return value;
        }
    }

    @Override
    public int peek() {
        /* TODO */
        if (top == null) {
            return -1;
        }else{
            return top.data;
        }
    }

    @Override
    public boolean isEmpty() {
        /* TODO */
        return top == null;
    }


}

