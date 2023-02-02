package ExerMethods;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        // метод, който принтира средния символ
        // четна дължина на текста -> 2 средни символа
        // нечетна дължина на текста -> 1 среден символ
        printMiddleCharacters(inputText);

    }
    public static  void printMiddleCharacters(String  text){

        if ( text.length() % 2 == 0){
            // 3245
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));
        }else {
            //aString  7 / 2 = 3
            System.out.println(text.charAt(text.length() / 2));
        }
    }
}
