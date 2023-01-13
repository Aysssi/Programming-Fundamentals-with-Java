package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());// стойността на числото , което ше модифицирам
        int startNumber = number;

        //за всяка цифра
        //1. цифра -> 1. последна цифра (%10) ; // последната цифра
        //2. намираме ФАКТУРЕЛА
        //3. сумираме Фактурела

        int sumFactorial = 0;
//докато number
        while (number > 0){
            int lastDigit = number % 10;// последната цифра
            // намираме фактурела на числото lastDigit
            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;

            }
            // сумирам фактурела
            sumFactorial += fact;
            number = number / 10;//премахваме последната цифра

        }
//първ. цифра == сумата на фак.
        if (startNumber == sumFactorial){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}


