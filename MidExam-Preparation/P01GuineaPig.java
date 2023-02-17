package MidExamPreparation;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());

        double foodGrams = foodKg * 1000;
        double hayGrams = hayKg * 1000;
        double coverGrams = coverKg * 1000;
        double weightGrams = weightKg * 1000;


        boolean isNotEnough = false;
        for (int day = 1; day <= 30 ; day++) {
            foodGrams = foodGrams - 300;

            if (day % 2 == 0){
                double neededHay = foodGrams  * 0.05;
                hayGrams = hayGrams - neededHay;
            }

            if (day % 3 == 0) {
                double neededCover = weightGrams / 3;
                coverGrams = coverGrams - neededCover;
            }
            if (foodGrams <= 0 || hayGrams <= 0 || coverGrams <= 0){
                isNotEnough = true;
                break;
            }
        }
        if (isNotEnough){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGrams / 1000,hayGrams / 1000,coverGrams /1000);
        }

    }
}