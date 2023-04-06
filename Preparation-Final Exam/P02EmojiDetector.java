package FinalExamPreparation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  text = scanner.nextLine();

        Pattern patternDigit = Pattern.compile("[0-9]");
        Matcher matcherDigit = patternDigit.matcher(text);

        long coolThreshold = 1;
        while (matcherDigit.find()){

            int digit = Integer.parseInt(matcherDigit.group());
            coolThreshold *= digit;
        }

        Pattern patternEmoji = Pattern.compile("([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcherEmoji = patternEmoji.matcher(text);

        List<String > emojiList = new ArrayList<>();
        int countOfAllEmojis = 0;
        while (matcherEmoji.find()){
            countOfAllEmojis ++;
            String emoji = matcherEmoji.group("emoji");

            long sumLetterOfEmoji = 0;
            for (int i = 0; i < emoji.length(); i++) {
                int currentSymbol = emoji.charAt(i);

                sumLetterOfEmoji += currentSymbol;

            }

            if (sumLetterOfEmoji >= coolThreshold){
                emojiList.add(matcherEmoji.group());
            }
        }

        System.out.printf("Cool threshold: %d%n",coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",countOfAllEmojis);
        System.out.println(String.join(System.lineSeparator(),emojiList));

    }
}