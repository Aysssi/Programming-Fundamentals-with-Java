package FinalExamPreparation;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder messageSb = new StringBuilder(scanner.nextLine());

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Decode")){
            String [] commandArr = commandLine.split("\\|");
            String command = commandArr[0];

            switch (command){
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandArr[1]);

                    String letterOfMove = messageSb.substring(0,numberOfLetters);
                    messageSb.delete(0,numberOfLetters);
                    // or  messageSb.replace(0,numberOfLetters,"");
                    messageSb.append(letterOfMove);

                    break;
                case "Insert":
                    int index = Integer.parseInt( commandArr[1]);
                    String  value = commandArr[2];

                    messageSb.insert(index,value);

                    break;
                case "ChangeAll":
                    String  substring = commandArr[1];
                    String replacement = commandArr[2];

                    String newText =  messageSb.toString().replace(substring,replacement);
                    messageSb = new StringBuilder(newText);
                    break;

            }

            commandLine = scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+ messageSb);
    }


}
