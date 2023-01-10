package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amountMoney  =  Double.parseDouble(scanner.nextLine());
        int countStudent = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts =  Double.parseDouble(scanner.nextLine());

        //Because the lightsabers sometimes break, George Lucas should buy 10% more, rounded up to the next integer.
        // Also, every sixth belt is free.

        double saberCount =  Math.ceil(countStudent * 1.10);
        int beltCount = countStudent - countStudent /6; // // Also, every sixth belt is free.
        double total = saberCount * priceLightsabers + robes * countStudent + belts * beltCount;



        if (amountMoney >= total){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        } else  {
            System.out.printf("George Lucas will need %.2flv more.",total - amountMoney);
        }



    }
}
