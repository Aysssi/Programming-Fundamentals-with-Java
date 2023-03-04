package ExerMapsLambdaAndStreamAPI;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap <String,Double> productPriceMap = new LinkedHashMap<>();
        LinkedHashMap <String ,Integer> productQuantityMap =new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("buy")){
            String [] ordersArr = input.split(" ");
            String product = ordersArr[0];
            double price = Double.parseDouble(ordersArr[1]);
            int quantity = Integer.parseInt(ordersArr[2]);

            if (!productQuantityMap.containsKey(product)){
                productQuantityMap.put(product,0);
            }
            int currentQuantity = productQuantityMap.get(product);
            productQuantityMap.put(product,currentQuantity + quantity);

            productPriceMap.put(product,price);


            input =scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productQuantityMap.entrySet()) {
            String productName = entry.getKey();

            double finalPrice = productQuantityMap.get(productName) * productPriceMap.get(productName);
            System.out.printf("%s -> %.2f%n",productName,finalPrice);
        }

    }
}
