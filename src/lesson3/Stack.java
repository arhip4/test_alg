package lesson3;

public class Stack<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Stack() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }



}
