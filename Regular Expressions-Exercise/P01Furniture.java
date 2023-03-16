package ExerRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String  input = scanner.nextLine();

        Pattern pattern = Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)");

        double totalMoney = 0;
        List<String > furnitureNameList = new ArrayList<>();
        while (!input.equals("Purchase")){

         Matcher matcher = pattern.matcher(input);

         if (matcher.find()) {

             String furnitureName = matcher.group("furnitureName");
             double price = Double.parseDouble(matcher.group("price"));
             int quantity = Integer.parseInt(matcher.group("quantity"));

             furnitureNameList.add(furnitureName);
             double currentFurniturePrice = price * quantity;
             totalMoney += currentFurniturePrice;
         }

            input =scanner.nextLine();
        }

        System.out.println("Bought furniture:");

        furnitureNameList.forEach(System.out::println);
//        for (String  name : furnitureNameList) {
//            System.out.println(name);
//        }
        System.out.printf("Total money spend: %.2f",totalMoney);

    }
}
