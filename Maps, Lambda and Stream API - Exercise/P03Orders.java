package ExerMapsLambdaAndStreamAPI;

import java.util.*;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap <String, List<Double>> productsMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")){
           String [] itemArr = input.split("\\s+");
           String name = itemArr[0];
           Double price = Double.parseDouble(itemArr[1]);
           Double quantity = Double.parseDouble(itemArr[2]);

           if (!productsMap.containsKey(name)){
               productsMap.put(name,new ArrayList<>());
               productsMap.get(name).add(price);
               productsMap.get(name).add(quantity);
           }else {
               productsMap.get(name).set(0,price);
               productsMap.get(name).set(1,productsMap.get(name).get(1) + quantity);

           }


            input =scanner.nextLine();
        }
        for (Map.Entry<String, List<Double>> entry : productsMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue().get(0) *  entry.getValue().get(1));
        }

    }
}
