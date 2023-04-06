package FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String words = scanner.nextLine();
        Pattern pattern = Pattern.compile("([@|#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(words);

        List<String > mirrorWordsList = new ArrayList<>();
        int validPairsCount = 0;
        while (matcher.find()){
            validPairsCount++;
            String wordFirst = matcher.group("word1");
            String wordSecond = matcher.group("word2");

            StringBuilder reverseWordSecond = new StringBuilder(wordSecond);
            reverseWordSecond.reverse();

            if (reverseWordSecond.toString().equals(wordFirst)){
                mirrorWordsList.add(wordFirst + " <=> " + wordSecond);
            }
        }


        if (validPairsCount > 0){
            System.out.printf("%d word pairs found!%n",validPairsCount);
        } else  {
            System.out.println( "No word pairs found!");
        }

        if (mirrorWordsList.isEmpty()){
            System.out.println("No mirror words!");
        } else  {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ",mirrorWordsList));

    }
}

}