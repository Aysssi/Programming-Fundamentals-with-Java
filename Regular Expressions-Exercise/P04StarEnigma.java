package ExerRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Pattern patternKey = Pattern.compile("[starSTAR]");
        Pattern patternMessage = Pattern.compile("^[^@\\-!:>]*@(?<name>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldier>\\d+)[^@\\-!:>]*$");

        List<String> attackedList = new LinkedList<>();
        List<String> destroyedList = new LinkedList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String message = scanner.nextLine();
            Matcher matcherKey = patternKey.matcher(message);

            int count = 0;
            while (matcherKey.find()){
                count++;

            }

            StringBuilder encryptedSb = new StringBuilder(message);
            for (int j = 0; j < encryptedSb.length(); j++) {
                int newSymbol = encryptedSb.charAt(j) - count;
                encryptedSb.setCharAt(j,(char) newSymbol);
            }

            Matcher matcherMessage = patternMessage.matcher(encryptedSb.toString());

            while (matcherMessage.find()){
                String planetName= matcherMessage.group("name");
                int population = Integer.parseInt(matcherMessage.group("population"));
                String attack  = matcherMessage.group("attack");
                int soldierCount= Integer.parseInt(matcherMessage.group("soldier"));

                if (attack.equals("A")){
                    attackedList.add(planetName);

                }else if (attack.equals("D")){
                    destroyedList.add(planetName);
                }

            }

        }
        System.out.printf("Attacked planets: %d%n",attackedList.size());
        attackedList.stream().sorted(String::compareTo).forEach(p->System.out.printf("-> %s%n", p));

        System.out.printf("Destroyed planets: %d%n",destroyedList.size());
        destroyedList.stream().sorted(String::compareTo).forEach(p->System.out.printf("-> %s%n",p));
    }
}
