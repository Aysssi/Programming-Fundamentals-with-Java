package ExerMapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        LinkedHashMap <String,Integer> resourcesMap = new LinkedHashMap<>();
         while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourcesMap.containsKey(resource)){
                resourcesMap.put(resource,0);
            }
             resourcesMap.put(resource,resourcesMap.get(resource) + quantity);
             resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue());

        }


    }
}
