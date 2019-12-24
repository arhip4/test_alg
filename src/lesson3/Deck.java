package lesson3;

public class Deck <T>{

    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin_right = 0;
    private int begin_left = 0;
    private int end_right = 0;
    private int end_left = 0;

    public Deck(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Deck() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }


}
