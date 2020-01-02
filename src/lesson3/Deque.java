package lesson3;

import java.util.EmptyStackException;

public class Deque <T>{

    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;

    private int end = 0;


    public Deque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public Deque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size++;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peekFront();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[begin];
    }
    public void push(T value){
        if(isFull()){
            throw new StackOverflowError();
        }
        list[size] = value;
        size++;
    }

    public T pop(){
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list[size-1];
    }
    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
