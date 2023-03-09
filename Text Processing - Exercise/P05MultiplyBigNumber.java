package ExerTextProcessing;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String  number = scanner.nextLine();
        int multiply = Integer.parseInt(scanner.nextLine());

        StringBuilder resultSb = new StringBuilder();
        int remainder = 0;
        //9999
        //9
        for (int i = number.length() -1; i >= 0; i--) {
          int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
          int product = digit * multiply + remainder;

          if (i == 0){
              resultSb.insert(0,product);

          } else  {
              int digitToAdd = product % 10;
              remainder = product /10;
              resultSb.insert(0,digitToAdd);
          }
        }
         while (resultSb.charAt(0) == '0' && resultSb.length() > 1){
             resultSb.deleteCharAt(0);
         }
        System.out.println(resultSb);
    }
}
