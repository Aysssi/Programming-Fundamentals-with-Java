package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //1.всеки аски код от start до end
             //2.за всеки код  -> символа

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int i = startCode; i <= endCode ; i++) {

           // System.out.print((char) i + " ");
            System.out.printf("%c ",i);
        }


    }
}
