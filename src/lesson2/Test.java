package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Test<T extends Comparable> {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] a = new int[100000];

        for (int i = 0; i < 99999; i++) {
            a[i] = random.nextInt(100);
        }

        long timeIn = System.currentTimeMillis();

        System.out.println(Arrays.toString(a));

        int key;
        for (int i = 1; i < a.length; i++) {
            int j = i;
            key = a[i];
            while (j > 0 && key < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = key;
        }

        long timeOut = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        long timeResult = (timeOut - timeIn) ;
        System.out.println("Время сортировки: " + timeResult + " ms");

    }
}
