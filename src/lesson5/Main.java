package lesson5;

public class Main {public static void main(String[] args) {
    System.out.println(recExpon(2,10));
}

    static long recExpon (int a, int b){
        if (b == 1) {
            return a;
        }
        return recExpon(a, b - 1) * a;
    }
}

