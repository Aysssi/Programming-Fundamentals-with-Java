package LabTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > repeatedWordList = new ArrayList<>();
         String [] wordArr = scanner.nextLine().split(" ");

        for (int i = 0; i < wordArr.length ; i++) {
            String currentWord = wordArr[i];
            int lengthWord = currentWord.length();

            String repeatedWord = repeated (currentWord,lengthWord);
            repeatedWordList.add(repeatedWord);
        }

        System.out.println(String.join("",repeatedWordList));
    }

    private static String repeated(String currentWord, int count) {

        StringBuilder repeatedSb = new StringBuilder();
        for (int i = 0; i < count ; i++) {
            repeatedSb.append(currentWord);
        }
        return repeatedSb.toString();
    }


}
