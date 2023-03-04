package ExerMapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String ,String > usersMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {

            String [] inputArr = scanner.nextLine().split("\\s+");
            String command = inputArr[0];
            String username = inputArr[1];

            switch (command) {
                case "register":
                    String  licensePlateNumber = inputArr[2];

                    if (usersMap.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",licensePlateNumber);
                    }else {
                        usersMap.put(username,licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n",username,licensePlateNumber);
                    }

                    break;
                case "unregister":
                    if (!usersMap.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else {
                        usersMap.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }
                    break;
            }

        }

       usersMap.forEach((k, v) -> System.out.println(k + " => " + v));

//        for (Map.Entry<String, String> entry : usersMap.entrySet()) {
//            System.out.printf("%s => %s%n", entry.getKey(),entry.getValue());
//        }


    }
}
