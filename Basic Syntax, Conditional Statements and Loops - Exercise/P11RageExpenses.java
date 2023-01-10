package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice =  Double.parseDouble(scanner.nextLine());
        double mousePrice =  Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

//Every second lost game, Peter trashes his headset.
//Every third lost game, Peter trashes his mouse.
//When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//Every second time, when he trashes his keyboard, he also trashes his display.

        int headset = lostGamesCount / 2;
        int mouse = lostGamesCount / 3;
        int keyboard = lostGamesCount / 6 ;
        int display = lostGamesCount / 12;

        double total = headsetPrice * headset + mousePrice * mouse + keyboardPrice * keyboard + displayPrice * display;
        System.out.printf("Rage expenses: %.2f lv.",total);
    }
}
