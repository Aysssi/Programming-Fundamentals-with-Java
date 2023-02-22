package LabObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int initNum = 1;
        BigInteger result = new BigInteger(String.valueOf(initNum));
        for (int index = 1; index <= number; index++) {

           result = result.multiply(BigInteger.valueOf(index));

        }
        System.out.println(result);
    }
}
