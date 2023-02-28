package LabMapsLambdaAndStreamAPI;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


      String [] inputArr = scanner.nextLine().split(" ");

      LinkedHashMap<String ,Integer> wordsMap = new LinkedHashMap<>();
        for ( String  word : inputArr)  {
            word = word.toLowerCase();

            wordsMap.putIfAbsent(word,0);
            int value = wordsMap.get(word);
            wordsMap.put(word,value + 1);

        }

        ArrayList<String > oddsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0){
                oddsList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ",oddsList));

    }
}
