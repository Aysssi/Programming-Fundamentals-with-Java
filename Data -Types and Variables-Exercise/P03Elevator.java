package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleN = Integer.parseInt(scanner.nextLine());
       int capacityP = Integer.parseInt(scanner.nextLine());



        double course = Math.ceil(peopleN * 1.0 / capacityP);

       System.out.printf("%.0f",course);


    }
}
