package ExerMapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> itemsMap = new LinkedHashMap<>();

        itemsMap.put("shards", 0);
        itemsMap.put("fragments", 0);
        itemsMap.put("motes", 0);

        LinkedHashMap<String, Integer> junkItemsMap = new LinkedHashMap<>();

       boolean isWin = false;
        while (!isWin) {
            String[] inputData = scanner.nextLine().split(" ");
            for (int index = 0; index <= inputData.length - 1; index += 2) {
                //"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    int currentQuantity = itemsMap.get(material);
                    itemsMap.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItemsMap.containsKey(material)) {
                        junkItemsMap.put(material, quantity);
                    }else {
                        int current = junkItemsMap.get(material);
                        junkItemsMap.put(material, current + quantity);
                    }
                }
                if (itemsMap.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    itemsMap.put("shards",itemsMap.get("shards") - 250);
                    isWin =true;
                    break;
                } else if (itemsMap.get("fragments") >= 250) {
                    System.out.println(" Valanyr obtained!");
                    itemsMap.put("fragments",itemsMap.get("fragments") - 250);
                    isWin =true;
                    break;
                } else if (itemsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    itemsMap.put("motes",itemsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }

            }
            if (isWin) {
                break;

            }
        }

        for (Map.Entry<String, Integer> entry : itemsMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junkItemsMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

    }
}