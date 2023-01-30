package LabMethods;

import java.awt.desktop.UserSessionEvent;
import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNumInput = Integer.parseInt(scanner.nextLine());
                int secondNumInput = Integer.parseInt(scanner.nextLine());

                int result = getMax(firstNumInput, secondNumInput);
                System.out.println(result);
                break;
            case "char":
                char firstSymbolInput = scanner.nextLine().charAt(0);
                char secondSymbolInput = scanner.nextLine().charAt(0);

                System.out.println(getMax(firstSymbolInput, secondSymbolInput));
                break;
            case "string":
                String firstTextInput = scanner.nextLine();
                String secondTextInput = scanner.nextLine();

                System.out.println(getMax(firstTextInput, secondTextInput));
                break;

        }

    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char getMax(char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else {
            return secondSymbol;
        }
    }

    public static String getMax(String firstText, String secondText) {
        if (firstText.compareTo(secondText) > 0) {
            return firstText;
        } else {
            return secondText;
        }
    }
}
