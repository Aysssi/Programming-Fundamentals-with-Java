package ExerTextProcessing;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String text = scanner.nextLine();

     StringBuilder encryptedTextSb = new StringBuilder();
        for ( char symbol : text.toCharArray()) {

            char encryptedSymbol = (char) (symbol + 3 );
            encryptedTextSb.append(encryptedSymbol);

        }
        System.out.print(encryptedTextSb);
    }
}
