package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input
        // Calculate the volume
        // max volume of the biggest keg. -> модел

        int n = Integer.parseInt(scanner.nextLine());

         double maxVolumeBiggest = Double.MIN_VALUE;
         String maxModelBiggest = " ";
        for (int i = 1; i <= n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * ( Math.pow(radius,2) * height);
            if (volume > maxVolumeBiggest){
                maxVolumeBiggest = volume;
                maxModelBiggest = model;

            }
        }
        System.out.println(maxModelBiggest);
    }
}
