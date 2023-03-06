package LabTextProcessing;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] banWordsArr = scanner.nextLine().split(", ") ;
        String text = scanner.nextLine();

        for (String  word :  banWordsArr) {

            int lengthWord = word.length();
            String replaceWord = replaceAsterisks (word,lengthWord);
            text = text.replace(word,replaceWord);
        }

        System.out.print(text);
    }

    private static String replaceAsterisks(String word, int lengthWord) {
        StringBuilder asterisks = new StringBuilder();
        for (int i = 0; i < lengthWord; i++) {
            asterisks.append("*");
        }
        return asterisks.toString();
    }

}



