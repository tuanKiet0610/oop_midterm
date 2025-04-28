package deki2_2425_de1.datastructure;

/**
 * Stack sử dụng cấu trúc dữ liệu mảng.
 */
public class MyArrayStack implements MyStack {
    public static final int MAX_SIZE = Integer.MAX_VALUE - 8;
    private static final int DEFAULT_INITIAL_CAPACITY = 8;
    private int[] elements;
    private int numberOfElements;

    public MyArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyArrayStack(int initialCapacity) {
        /* TODO */
        elements = new int[initialCapacity];
        numberOfElements = 0;
    }

    @Override
    public void push(int value) {
        /* TODO */
        if(numberOfElements == elements.length) {
            grow();
        }
        elements[numberOfElements] = value;
        numberOfElements++;
    }

    /*
     * Tăng kích thước stack lên gấp đôi.
     */
    private void grow() {
        /* TODO */
        int newSize = elements.length * 2;
        if(newSize > MAX_SIZE) {
            throw new RuntimeException("Stack is full");
        }
        int[] newElements = new int[newSize];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public int pop() {
        /* TODO */
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = elements[numberOfElements - 1];
        numberOfElements--;
        return value;
    }

    @Override
    public int peek() {
        /* TODO */
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[numberOfElements - 1];
    }

    @Override
    public boolean isEmpty() {
        /* TODO */
        return numberOfElements == 0;
    }

}
