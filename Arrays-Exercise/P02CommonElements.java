package ExerArrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> 2 текстови масива
        // 2. обхождам всеки един елемент от 2масив
            //повтарям: обхождам 1 масив --> елем2 == елем1

      String [] firstArr = scanner.nextLine().split(" ");
      String [] secondArr = scanner.nextLine().split(" ");

        for (String itemSecond : secondArr) {
            for ( String itemFirst : firstArr) {
                if (itemSecond.equals(itemFirst)){
                    System.out.print(itemFirst + " ");
                    break;
                }
            }

        }

    }
}
