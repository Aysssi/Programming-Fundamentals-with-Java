package LabTextProcessing;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        while (!text.equals("end")){

            StringBuilder textReversed = new StringBuilder();


            for (int i = text.length() -1; i >=  0; i--) {
                char currentSymbol = text.charAt(i);
                textReversed.append(currentSymbol);
            }

            System.out.printf("%s = %s%n",text,textReversed);

            text = scanner.nextLine();
        }



    }
}
