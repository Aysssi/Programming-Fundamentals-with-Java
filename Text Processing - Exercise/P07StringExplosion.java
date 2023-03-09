package ExerTextProcessing;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input  = scanner.nextLine();//"abv>1>1>2>2asdasd"
        StringBuilder textSb = new StringBuilder(input);

        int totalStrength = 0;
        for (int i = 0; i <= textSb.length() - 1 ; i++) {
            char currentSymbol = textSb.charAt(i);

            if (currentSymbol == '>'){

                int explosionStrength = Integer.parseInt(textSb.charAt(i + 1) + "");
                totalStrength += explosionStrength;


            } else if (currentSymbol != '>' &&  totalStrength > 0) {
                textSb.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.print(textSb);
    }
}
