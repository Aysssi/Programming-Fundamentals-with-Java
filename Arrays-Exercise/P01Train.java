package ExerArrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];


        for (int i = 0; i < train.length; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            train[i] = countPeople;

        }
        int allPeople = 0;
        for (int count : train) {
            allPeople += count;
            System.out.print(count + " " );
        }
        System.out.printf("\n%s",allPeople);
    }
}
