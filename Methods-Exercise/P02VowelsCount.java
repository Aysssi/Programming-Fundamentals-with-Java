package ExerMethods;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входни данни -> текст
        // метод, който принтира броя на гласните букви
        // !!! текст изцяло с малки букви

        String textInput = scanner.nextLine();
       printVowelsCount(textInput.toLowerCase());
    }

    public static void printVowelsCount (String  text){

        int count = 0;
        for ( char symbol : text.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol =='i' || symbol == 'o' || symbol == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
