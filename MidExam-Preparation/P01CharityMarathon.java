package MidExamPreparation;

import java.util.Scanner;

public class P01CharityMarathon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        long  marathonDays =Long.parseLong(scanner.nextLine());
        long numberRunners  =Long.parseLong(scanner.nextLine());
        int averageNumberLaps =Integer.parseInt(scanner.nextLine());
        long lengthTrack =Long.parseLong(scanner.nextLine());
        int capacityTrack =Integer.parseInt(scanner.nextLine());
        double amountMoney =Double.parseDouble(scanner.nextLine());



        long maximumRunners = capacityTrack * marathonDays;
        numberRunners = Math.min(maximumRunners,numberRunners);
        long totalMeters = numberRunners * averageNumberLaps *  lengthTrack;
        long totalKilometers = totalMeters / 1000;
        double money = totalKilometers * amountMoney;

        System.out.printf("Money raised: %.2f",money);

    }
}
