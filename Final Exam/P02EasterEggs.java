package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataLine = scanner.nextLine();

        Pattern pattern = Pattern.compile("[@#]+(?<color>[a-z]{3,})[@#]+[^A-Za-z0-9]*[\\\\/]+(?<amount>[0-9]+)[\\\\/]+");

        Matcher matcher = pattern.matcher(dataLine);

        while (matcher.find()) {

            String colorEggs = matcher.group("color");
            String amountEggs = matcher.group("amount");

            System.out.printf("You found %s %s eggs!%n", amountEggs, colorEggs);
        }


    }
}
