package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>(50);
        String inputString = "Привет, мир!";
//        char[] charArr = inputString.toCharArray();
//        System.out.println(Arrays.toString(charArr));

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(stack.pop());
        }

        System.out.println();

//        Deque<Integer> deck = new Deque<>(10);
//
//        for (int i = 0; i < 10; i++) {
//            deck.insert(i);
//        }
//        for (int i = 0; i < deck.size(); i++) {
//            System.out.print(deck.pop());
//
//        }
    }
}
