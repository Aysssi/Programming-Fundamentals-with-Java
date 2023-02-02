package ExerMethods;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            String  command = scanner.nextLine();

            while (!command.equals("END")){
                System.out.println(isPalindrome(command));


                command = scanner.nextLine();
            }

    }
    //метод, който проверява дали числото ми е палиндром
    //true -> ако е палиндром
    //false-> ако не е палиндром
    private static boolean isPalindrome (String number){
     // проверка  дали числото е същото като числото записано на обратно
      String  reversedNumber = getReversedNumber(number);

      return number.equals(reversedNumber);
    }

    private static String getReversedNumber(String number) {
        //обхождам числото от последния към първия елемент
        String reversed ="";
        for (int index = number.length() - 1; index >= 0 ; index--) {
            char currentElement = number.charAt(index);
            reversed += currentElement;
        }
        // обходени всички елементи
        return  reversed;
    }
}
