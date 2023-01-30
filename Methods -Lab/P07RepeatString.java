package LabMethods;

import java.util.Scanner;


public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String resul = repeatSting(textInput,n);
        System.out.println(resul);
    }
    public static String repeatSting(String text , int n){

       String  result = "";
        for (int i = 1; i <= n ; i++) {
            result += text;
        }
        return  result;
    }
}
