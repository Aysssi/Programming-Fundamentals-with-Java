package LabMethods;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int result = rectangleArea(widthInput,lengthInput);
        System.out.println(result);
    }
    public static int rectangleArea (int width, int length){

        return width * length;
    }
}

