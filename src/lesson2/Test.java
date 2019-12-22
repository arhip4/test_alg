package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Test<T extends Comparable> {
  private  static Random random = new Random();


    public static void main(String[] args) {

        int[] a = new int[100000];

        for (int i = 0; i < 99999; i++) {
            a[i] = random.nextInt(100);
        }

        long timeIn = System.currentTimeMillis();

        System.out.println(Arrays.toString(a));

        int x;
        for (
                int i = 1;
                i < a.length; i++) {
            int j = i;
            x = a[i];
            while (j > 0 && x < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = x;
        }

        long timeOut = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        long timeResult = (timeOut - timeIn);
        System.out.println("Время сортировки: " + timeResult + " ms");

        int[] b = new int[100000];

        for (int i = 0; i < 99999; i++) {
            b[i] = random.nextInt(100);
        }

        long timeIn1 = System.currentTimeMillis();

        System.out.println(Arrays.toString(b));


        for (int i = 0; i < b.length - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < b.length; j++) {
                if (b[j] < b[imin]) {
                    imin = j;
                }

            }
            int temp = b[i];
            b[i] = b[imin];
            b[imin] = temp;

        }
        long timeOut1 = System.currentTimeMillis();
        System.out.println(Arrays.toString(b));
        long timeResult1 = (timeOut1 - timeIn1);
        System.out.println("Время сортировки: " + timeResult1 + " ms");

    }
}
