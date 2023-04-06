package FinalExamPreparation;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Generate")){
            String [] commandArr = commandLine.split(">>>");
            String command = commandArr[0];

            switch (command){
                case "Contains":
                    String substring = commandArr[1];

                    if (activationKey.toString().contains(substring)){

                        System.out.printf("%s contains %s%n",activationKey,substring);
                    }else {
                        System.out.println("Substring not found!");

                    }
                    break;
                case "Flip":
                    String upperOrLower = commandArr[1];
                    int startIndexFlip = Integer.parseInt(commandArr[2]);
                    int endIndexFlip = Integer.parseInt(commandArr[3]);

                    String substringKey = activationKey.substring(startIndexFlip,endIndexFlip);

                    if (upperOrLower.equals("Upper")){
                        String upperSubstring =  activationKey.toString().replace(substringKey,substringKey.toUpperCase());
                        activationKey = new StringBuilder(upperSubstring);

                    } else if (upperOrLower.equals("Lower")) {
                        String lowerSubstring = activationKey.toString().replace(substringKey,substringKey.toLowerCase());
                        activationKey = new StringBuilder(lowerSubstring);

                    }

                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndexSlice = Integer.parseInt(commandArr[1]);
                    int endIndexSlice = Integer.parseInt(commandArr[2]);

                    activationKey.delete(startIndexSlice,endIndexSlice);

                    System.out.println(activationKey);
                    break;

            }

            commandLine = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}
