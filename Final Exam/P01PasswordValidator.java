package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String dataLine = scanner.nextLine();


        while (!dataLine.equals("Complete")) {

            if (dataLine.contains("Make Upper")) {
                int index = Integer.parseInt(dataLine.split(" ")[2]);

                password = getPasswordWithUpperChar(index, password);
                System.out.println(password);

            } else if (dataLine.contains("Make Lower")) {
                int index = Integer.parseInt(dataLine.split(" ")[2]);

                password = getPasswordWithLowerChar(index, password);
                System.out.println(password);

            } else if (dataLine.contains("Insert")) {
                int index = Integer.parseInt(dataLine.split(" ")[1]);
                char symbol = dataLine.split(" ")[2].charAt(0);

                password = getPasswordWithInsertedChar(index, symbol, password);
                System.out.println(password);

            } else if (dataLine.contains("Replace")) {
                char symbol = dataLine.split(" ")[1].charAt(0);
                int value = Integer.parseInt(dataLine.split(" ")[2]);

                if (password.contains(symbol + "")) {
                    char newSymbol = (char) (symbol + value);
                    password = getPasswordWithReplacedSymbol(symbol, newSymbol, password);
                    System.out.println(password);
                }

            } else if (dataLine.contains("Validation")) {

                validatePassword(password);

            }


            dataLine = scanner.nextLine();
        }

    }

    private static boolean isValidIndex(int index, String password) {
        return index >= 0 && index < password.length();
    }

    private static String getPasswordWithUpperChar(int index, String password) {
        if (isValidIndex(index, password)) {
            String textBeforeIndex = "";
            if (index > 0) {
                textBeforeIndex = password.substring(0, index);
            }
            char upperCaseChar = Character.toUpperCase(password.charAt(index));
            String textAfterIndex = "";
            if (index < password.length() - 1) {
                textAfterIndex = password.substring(index + 1);
            }
            password = textBeforeIndex + upperCaseChar + textAfterIndex;
        }
        return password;
    }

    private static String getPasswordWithLowerChar(int index, String password) {
        if (isValidIndex(index, password)) {
            String textBeforeIndex = "";
            if (index > 0) {
                textBeforeIndex = password.substring(0, index);
            }
            char lowerCaseChar = Character.toLowerCase(password.charAt(index));
            String textAfterIndex = "";
            if (index < password.length() - 1) {
                textAfterIndex = password.substring(index + 1);
            }
            password = textBeforeIndex + lowerCaseChar + textAfterIndex;
        }
        return password;
    }

    private static String getPasswordWithInsertedChar
            (int index, char symbol, String password) {
        if (isValidIndex(index, password)) {
            StringBuilder sb = new StringBuilder(password);
            password = sb.insert(index, symbol).toString();

        }
        return password;
    }

    private static String getPasswordWithReplacedSymbol
            (char symbol, char newSymbol, String password) {
        password = password.replace(symbol, newSymbol);
        return password;
    }

    private static void validatePassword(String password) {

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long!");
        }

        Pattern patternAllSymbols = Pattern.compile("[^\\w]+");
        Matcher matcherAllSymbols = patternAllSymbols.matcher(password);

        if (matcherAllSymbols.find()) {
            System.out.println("Password must consist only of letters, digits and _!");
        }


        Pattern patternUpperLetter = Pattern.compile("[A-Z]");
        Matcher matcherUpperLetter = patternUpperLetter.matcher(password);

        if (!matcherUpperLetter.find()) {
            System.out.println("Password must consist at least one uppercase letter!");
        }


        Pattern patternLowerLetter = Pattern.compile("[a-z]");
        Matcher matcherLowerLetter = patternLowerLetter.matcher(password);

        if (!matcherLowerLetter.find()) {
            System.out.println("Password must consist at least one lowercase letter!");
        }


        Pattern patternDigit = Pattern.compile("[0-9]");
        Matcher matcherDigit = patternDigit.matcher(password);

        if (!matcherDigit.find()) {
            System.out.println("Password must consist at least one digit!");
        }



    }
}
