package MidExamPreparation;

import java.util.Scanner;

public class P08PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int groupSize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int coins = 0;
        for (int day = 1; day <= days ; day++) {

            if (day % 10 == 0){
                groupSize -= 2;
            }

            if (day % 15 == 0){
                groupSize += 5;
            }

                  coins += (50 - 2 * groupSize);

            if ( day % 3 == 0){
               coins -= (3 * groupSize);
            }
            if (day % 5 == 0){
                if (day % 3 == 0){
                    coins += (18 * groupSize);

                }else {
                    coins += (20 * groupSize);
                }
            }
        }
        System.out.printf("%d companions received %d coins each.",groupSize,coins /groupSize);

    }
}
