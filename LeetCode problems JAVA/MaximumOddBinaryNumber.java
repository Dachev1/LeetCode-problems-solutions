import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MaximumOddBinaryNumber {
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("111"));

    }

    public static String maximumOddBinaryNumber(String number) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stackOfOnes = new Stack<>();
        Stack<Character> stackOfZeros = new Stack<>();

        for (char chr : number.toCharArray()) {
            if (chr == 49) {
                stackOfOnes.add(chr);
            } else {
                stackOfZeros.add(chr);
            }
        }

        Character saveOneForTheLast = stackOfOnes.pop();
        while (!stackOfOnes.isEmpty()) {
            result.append(stackOfOnes.pop());
        }

        while (!stackOfZeros.isEmpty()) {
            result.append(stackOfZeros.pop());
        }
        result.append(saveOneForTheLast);

        return result.toString().trim();
    }
}
