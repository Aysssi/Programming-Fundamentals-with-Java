package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // повтаряме всеки ден => yield - 26;намаляме силата на полето  -10
        //стоп: бр. подправки в полето < 100
        // продължаваме : бр. подправки в полето > 100

        int source = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmountSpice = 0;
        while (source >= 100){
            int spice = source - 26;
            totalAmountSpice += spice;
            days++;
            source = source - 10;

        }
        if (totalAmountSpice >= 26){
            totalAmountSpice -= 26;
        }
        System.out.println(days);
        System.out.println(totalAmountSpice);
    }
}
