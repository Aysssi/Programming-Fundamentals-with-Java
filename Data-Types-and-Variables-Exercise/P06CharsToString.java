package LabDataTypesAndVariables;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       char fistSymbol = scanner.nextLine().charAt(0);
       char secondSymbol = scanner.nextLine().charAt(0);
       char thirdSymbol = scanner.nextLine().charAt(0);

       String resultText = String.format("%c%c%c",fistSymbol,secondSymbol,thirdSymbol);
        System.out.println(resultText);
    }
}
