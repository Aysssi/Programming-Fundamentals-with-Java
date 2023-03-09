package ExerTextProcessing;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //aaaaabbbbbcdddeeeedssaa

        StringBuilder inputSb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < inputSb.length() -1; i++) {
            char currentDigit = inputSb.charAt(i);
            char nextDigit = inputSb.charAt(i + 1);

            if (currentDigit == nextDigit){
                inputSb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(inputSb);
    }
}
