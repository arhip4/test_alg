package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Stack<String> stack = new Stack<>(2);
        String inputString = "Привет, мир!";
        char [] charArr = inputString.toCharArray();
        System.out.println(Arrays.toString(charArr));

        for (int i = 0;i < inputString.length(); i++){
            System.out.print(inputString.charAt(i) + " ");
        }
    }
}
