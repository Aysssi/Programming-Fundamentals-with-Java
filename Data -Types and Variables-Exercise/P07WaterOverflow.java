package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // повтаряме n брой  пъти
        // capacity 255л вадим получено количество вода

        int capacity = 255;
        int sumLittersTank = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            int quantitiesWater =Integer.parseInt(scanner.nextLine());
            if ( quantitiesWater <= capacity){
                 capacity  = capacity - quantitiesWater;
                sumLittersTank += quantitiesWater;

            }else {
                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(sumLittersTank);
    }
}
