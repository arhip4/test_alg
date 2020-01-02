package lesson3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Deque <T>{

    private T[] list;
    private int size = 0;
    private int begin = 0;
    private int end = 0;
    private double loadFactor = 0.75;


    public Deque() {
        this(10);
    }

    public Deque(int num) {
        this(num, 0.75);
    }

    public Deque(int num, double loadFactor) {
        setLoadFactor(loadFactor);
        if (num > 0) {
            list = (T[]) new Object[num];
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void addRight(T value) {
        size++;
        expand();
        list[end] = value;
        end = nextIndex(end);
    }

    public void addLeft(T value) {
        size++;
        expand();
        begin = lastIndex(begin);
        list[begin] = value;
    }

    public T peekRight() {
        if (size <= 0) {
            throw new EmptyStackException();
        }
        return list[begin];
    }

    public T peekLeft() {
        if (size <= 0) {
            throw new EmptyStackException();
        }
        return list[lastIndex(end)];
    }

    public T removeRight() {
        T value = peekRight();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }

    public T removeLeft() {
        T value = peekLeft();
        size--;
        end = lastIndex(end);
        list[end] = null;
        return value;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int lastIndex(int index) {
        return (list.length + index - 1) % list.length;
    }

    public void info() {
        System.out.print(Arrays.toString(list));
        System.out.printf("begin: %d end: %d size %d \n", begin, end, size);
    }


    private final void setLoadFactor(double loadFactor) {
        if (loadFactor > 0 && loadFactor < 1) {
            this.loadFactor = loadFactor;
        }
    }

    private void expand() {
        if ((double) size / list.length > loadFactor) {
            T[] tempArr = (T[]) new Object[list.length * 2];
            if (begin <= end) {
                System.arraycopy(list, 0, tempArr, 0, list.length);
            } else {
                System.arraycopy(list, 0, tempArr, 0, end);
                int newBegin = tempArr.length - list.length + begin;
                System.arraycopy(list, begin, tempArr, newBegin, list.length - begin);
                begin = newBegin;
            }
            list = tempArr;
        }
    }



}
