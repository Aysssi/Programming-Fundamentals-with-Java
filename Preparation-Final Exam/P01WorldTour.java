package FinalExamPreparation;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stopsSb = new StringBuilder(scanner.nextLine());

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Travel")){
            if (commandLine.contains("Add Stop")){
                int index = Integer.parseInt( commandLine.split(":")[1]);
                String insertString = commandLine.split(":")[2];

                if (isValidIndex(index, stopsSb)){
                    stopsSb.insert(index,insertString);
                }

            } else if (commandLine.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(commandLine.split(":")[1]);
                int endIndex = Integer.parseInt(commandLine.split(":")[2]);

                if (isValidIndex(startIndex,stopsSb) && isValidIndex(endIndex,stopsSb)){
                    stopsSb.delete(startIndex,endIndex +1);
                }

            } else if (commandLine.contains("Switch")) {
                String oldString = commandLine.split(":")[1];
                String newString = commandLine.split(":")[2];

                if (stopsSb.toString().contains(oldString)) {

                    String replaceString = stopsSb.toString().replace (oldString,newString);
                    stopsSb = new StringBuilder(replaceString);
                }
            }

            System.out.println(stopsSb);
            commandLine = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",stopsSb);
    }

    private static boolean isValidIndex(int index,StringBuilder stopsSb) {

        return  index >= 0 && index <= stopsSb.length() -1;
    }

}
