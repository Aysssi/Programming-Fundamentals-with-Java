package ExerMethods;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входни данни: 2 символа
       // проверка кой е по-малкия символ -> започваме от по-малкия
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printCharactersInRange (symbol1,symbol2);
    }

    public static void printCharactersInRange(char symbol1, char symbol2) {

        if (symbol1 < symbol2){

            for (char i = (char) (symbol1 + 1); i < symbol2; i++) {
                System.out.print( i + " ");
            }

        }else {
            for (char i = (char) (symbol2 +  1); i < symbol1 ; i++) {
                System.out.print(i + " ");
            }


        }
    }


}
