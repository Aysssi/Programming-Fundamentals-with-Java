package ExerTextProcessing;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       String [] inputArr = scanner.nextLine().split(" ");
       char [] text1 = inputArr[0].toCharArray();
       char [] text2 = inputArr[1].toCharArray();

        int smallestTextLength = Math.min(text1.length,text2.length);
       int biggerTextLength = Math.max(text1.length, text2.length);

            int sum = 0;

        for (int i = 0; i < biggerTextLength ; i++) {
            if (i < smallestTextLength){
                sum += text1[i] * text2[i];

            } else if (text1.length > text2.length){
                sum += text1[i];

            }else {
                sum += text2[i];

            }
        }
        System.out.println(sum);
    }
}
