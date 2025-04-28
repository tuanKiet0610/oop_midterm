package deki2_2425_de1.datastructure;

public class MyArrayQueue implements MyQueue {
    public static final int MAX_SIZE = Integer.MAX_VALUE - 8;
    private static final int DEFAULT_INITIAL_CAPACITY = 8;
    private int[] elements;
    private int headIndex;
    private int tailIndex;
    private int numberOfElements;

    public MyArrayQueue() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public MyArrayQueue(int capacity) {
        elements = new int[capacity];
        headIndex = 0;
        tailIndex = 0;
        numberOfElements = 0;
    }

    @Override
    public void enqueue(int element) {
        if (numberOfElements == elements.length) {
            grow();
        }
        elements[tailIndex] = element;
        tailIndex = (tailIndex + 1) % elements.length;
        numberOfElements++;
    }

    private void grow() {
        int newSize = elements.length * 2;
        if (newSize > MAX_SIZE) {
            throw new IllegalStateException("Queue has reached its maximum size");
        }

        int[] newElements = new int[newSize];
        for (int i = 0; i < numberOfElements; i++) {
            newElements[i] = elements[(headIndex + i) % elements.length];
        }

        elements = newElements;
        headIndex = 0;
        tailIndex = numberOfElements;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int element = elements[headIndex];
        headIndex = (headIndex + 1) % elements.length;
        numberOfElements--;

        return element;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return elements[headIndex];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

}
