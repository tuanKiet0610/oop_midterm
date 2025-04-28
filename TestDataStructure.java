package deki2_2425_de1.datastructure;

import java.util.Random;

public class TestDataStructure {
    public static void main(String[] args) {
        testArrayStack();
        testLinkedListStack();
        testArrayQueue();
        testLinkedListQueue();
    }

    public static void testArrayStack() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;  // Generate a number between 20 and 30
        MyArrayStack stack = new MyArrayStack();

        // Push n random integers to the stack
        for (int i = 0; i < n; i++) {
            stack.push(rand.nextInt(100));  // Random number between 0 and 99
        }

        System.out.println("ArrayStack sau khi thêm " + n + " giá trị:");
        printStack(stack);

        // Pop elements one by one and print the stack after each pop
        System.out.println("\nArrayStack sau khi xóa giá trị:");
        while (!stack.isEmpty()) {
            stack.pop();
            printStack(stack);
        }
    }

    public static void testLinkedListStack() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;
        MyLinkedListStack stack = new MyLinkedListStack();

        // Push n random integers to the stack
        for (int i = 0; i < n; i++) {
            stack.push(rand.nextInt(100));
        }

        System.out.println("LinkedListStack sau khi thêm " + n + " giá trị:");
        printStack(stack);

        // Pop elements one by one and print the stack after each pop
        System.out.println("\nLinkedListStack sau khi xóa giá trị:");
        while (!stack.isEmpty()) {
            stack.pop();
            printStack(stack);
        }
    }

    public static void testArrayQueue() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;
        MyArrayQueue queue = new MyArrayQueue();

        // Enqueue n random integers to the queue
        for (int i = 0; i < n; i++) {
            queue.enqueue(rand.nextInt(100));
        }

        System.out.println("ArrayQueue sau khi thêm " + n + " giá trị:");
        printQueue(queue);

        // Dequeue elements one by one and print the queue after each dequeue
        System.out.println("\nArrayQueue sau khi xóa giá trị:");
        while (!queue.isEmpty()) {
            queue.dequeue();
            printQueue(queue);
        }
    }

    public static void testLinkedListQueue() {
        Random rand = new Random();
        int n = rand.nextInt(11) + 20;
        MyLinkedListQueue queue = new MyLinkedListQueue();

        // Enqueue n random integers to the queue
        for (int i = 0; i < n; i++) {
            queue.enqueue(rand.nextInt(100));
        }

        System.out.println("LinkedListQueue sau khi thêm " + n + " giá trị:");
        printQueue(queue);

        // Dequeue elements one by one and print the queue after each dequeue
        System.out.println("\nLinkedListQueue sau khi xóa giá trị");
        while (!queue.isEmpty()) {
            queue.dequeue();
            printQueue(queue);
        }
    }

    // Helper method to print the contents of a stack
    public static void printStack(MyStack stack) {
        System.out.print("Stack: ");
        MyStack tempStack = new MyArrayStack();  // Temporary stack for printing in correct order
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value + " ");
            tempStack.push(value);  // Push to temporary stack to restore original stack order
        }
        System.out.println();

        // Restore original stack order
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    // Helper method to print the contents of a queue
    public static void printQueue(MyQueue queue) {
        System.out.print("Queue: ");
        MyQueue tempQueue = new MyArrayQueue();  // Temporary queue for printing in correct order
        while (!queue.isEmpty()) {
            int value = queue.dequeue();
            System.out.print(value + " ");
            tempQueue.enqueue(value);  // Enqueue to temporary queue to restore original queue order
        }
        System.out.println();

        // Restore original queue order
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
    }
}
