package ExerRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         List<String> racersNameList = Arrays
                         .stream(scanner.nextLine().split(", "))
                         .collect(Collectors.toList());

         LinkedHashMap<String ,Integer> racersDistancesMap = new LinkedHashMap<>();
         racersNameList.forEach(name -> racersDistancesMap.put(name,0));

        Pattern patternLetters = Pattern.compile("[A-Za-z]+");
        Pattern patternDigits = Pattern.compile("[0-9]");


         String input = scanner.nextLine();
         while (!input.equals("end of race")){

          StringBuilder  nameSb = new StringBuilder();
         Matcher matcherLetter = patternLetters.matcher(input);
         while (matcherLetter.find()){
             nameSb.append(matcherLetter.group());

         }

          int distance = 0;
         Matcher matcherDigits = patternDigits.matcher(input);
         while (matcherDigits.find()){
             distance += Integer.parseInt(matcherDigits.group());

         }

            String racerName = nameSb.toString();
            if (racersDistancesMap.containsKey(racerName)){
                int currentDistance = racersDistancesMap.get(racerName);
                racersDistancesMap.put(racerName,currentDistance +distance);

            }
             input =scanner.nextLine();
         }

        int count = 1;
        for (Map.Entry<String, Integer> entry : racersDistancesMap.entrySet()) {
            if (count == 1){
                count++;
                System.out.println("1st place: "+ entry.getKey());

            } else if (count == 2) {
                count++;
                System.out.println("2nd place: "+ entry.getKey());

            } else if (count == 3) {
                count++;
                System.out.println("3rd place: "+entry.getKey());
                 break;
            }
        }

    }
}
