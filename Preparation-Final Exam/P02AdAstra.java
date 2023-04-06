package FinalExamPreparation;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      String  textData = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#||])(?<itemName>[a-zA-z\\s]+)\\1(?<expirationDate>\\d{2}/\\d{2}/\\d{2})\\1(?<calories>[0-9]+)\\1");
        Matcher matcher = pattern.matcher(textData);

        StringBuilder outputSb = new StringBuilder();
        int sumCalories = 0;

        while (matcher.find()){
             String  itemName = matcher.group("itemName");
             String expirationDate = matcher.group("expirationDate");
             int calories = Integer.parseInt(matcher.group("calories"));

             sumCalories += calories;
             outputSb.append( String.format("Item: %s, Best before: %s, Nutrition: %d%n",itemName,expirationDate,calories));
        }

       int days = sumCalories / 2000;

        System.out.printf("You have food to last you for: %d days!%n",days );
        System.out.println(outputSb);
    }
}
