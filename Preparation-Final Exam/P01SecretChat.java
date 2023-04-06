package FinalExamPreparation;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder concealedMessageSb= new StringBuilder(scanner.nextLine());


         String commandLine = scanner.nextLine();
         while (!commandLine.equals("Reveal")){
             String [] commandArr = commandLine.split(":\\|:");
             String command = commandArr [0];
             switch (command){
                 case "InsertSpace":
                    int index =Integer.parseInt(commandArr[1]);

                    concealedMessageSb.insert(index," ");

                     break;
                 case "Reverse":

                     StringBuilder substringSb = new StringBuilder(commandArr[1]);
                     if (concealedMessageSb.toString().contains(substringSb)){
                         int startIndex = concealedMessageSb.indexOf(substringSb.toString());
                         int endIndex = startIndex + substringSb.length() - 1;
                         concealedMessageSb.delete(startIndex,endIndex + 1);
                         substringSb.reverse();
                         concealedMessageSb.append(substringSb);

                     }else {
                         System.out.println("error");
                         commandLine = scanner.nextLine();
                         continue;
                     }

                     break;
                 case "ChangeAll":
                     String changeSubstring = commandArr[1];
                     String replacement = commandArr[2];

                     String replacedString = concealedMessageSb.toString().replaceAll(changeSubstring,replacement);
                     concealedMessageSb.setLength(0);                //***
                     concealedMessageSb.append(replacedString);
                     break;

             }

             System.out.println(concealedMessageSb);
             commandLine = scanner.nextLine();
         }

        System.out.println("You have a new text message: " + concealedMessageSb);
    }
}
