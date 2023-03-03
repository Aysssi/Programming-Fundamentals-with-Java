package ExerMapsLambdaAndStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String,Integer > userPointsMap = new LinkedHashMap<>();
        HashMap<String ,Integer > languageCountMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")){
            String [] splitArr = input.split("-");
            String username = splitArr[0];

            //"{username}-{language}-{points}" -
            if (splitArr.length == 3){
                String language = splitArr[1];
                int  points = Integer.parseInt(splitArr[2]);

                if (!userPointsMap.containsKey(username)){
                    userPointsMap.put(username,0);
                }
                int currentPoint = userPointsMap.get(username);
                if (points > currentPoint){
                    userPointsMap.put(username,points);
                }

                if (!languageCountMap.containsKey(language)){
                    languageCountMap.put(language,0);
                }
                languageCountMap.put(language,languageCountMap.get(language) +1);

            } else{
              // or {username}-banned
                 userPointsMap.remove(username);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPointsMap.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey()+ " | " + e.getValue()));

        System.out.println("Submissions:");
        languageCountMap.entrySet().stream()
                .forEach(entry-> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
