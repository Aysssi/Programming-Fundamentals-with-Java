package FinalExamPreparation;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("([@][#]+)(?<barcode>[A-Z][a-zA-Z0-9]{4,}[A-Z])[@][#]+");
        for (int i = 1; i <= n; i++) {
           String differentBarcode = scanner.nextLine();

            Matcher matcher = pattern.matcher(differentBarcode);
            if (matcher.find()){
                String barcode = matcher.group("barcode");

                  StringBuilder digitsSb = new StringBuilder();
                for (int j = 0; j < barcode.length(); j++) {
                   char currentSymbol = barcode.charAt(j) ;

                   if (Character.isDigit(currentSymbol)){
                       digitsSb.append(currentSymbol);

                   }
                }

                if(digitsSb.length() > 0){
                    System.out.println("Product group: " + digitsSb);

                }else if (digitsSb.length() == 0){

                    System.out.println("Product group: 00" );
                }


            }else {

                System.out.println("Invalid barcode");
            }
        }
    }

}
