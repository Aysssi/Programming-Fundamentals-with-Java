package ExerMapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String textArr = scanner.nextLine();

        LinkedHashMap<Character , Integer> symbolMap = new LinkedHashMap<>();
        for (char  symbol : textArr.toCharArray()){
             if (symbol == ' '){
                 continue;
             }
            if (!symbolMap.containsKey(symbol)){
                symbolMap.put(symbol,0);
            }
            symbolMap.put(symbol,symbolMap.get(symbol) +1);
        }
        for (Map.Entry<Character, Integer> entry : symbolMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
