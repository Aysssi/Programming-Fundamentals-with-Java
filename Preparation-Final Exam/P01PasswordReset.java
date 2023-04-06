package FinalExamPreparation;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  password = scanner.nextLine();

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Done")){

         if (commandLine.equals("TakeOdd"))  {
          String newPassword;
             newPassword = getCharsOnOddPosition(password);
             password = newPassword;

             System.out.println(password);

         } else if (commandLine.contains("Cut")) {
             int  index = Integer.parseInt(commandLine.split("\\s+")[1]);
             int length = Integer.parseInt(commandLine.split("\\s+")[2]);

           String substringRemove = password.substring(index,index + length);
          password = password.replaceFirst(substringRemove, "");

             System.out.println(password);
         } else if (commandLine.contains("Substitute")) {
             String substring = commandLine.split("\\s+")[1];
             String substitute = commandLine.split("\\s+")[2];

              if (password.contains(substring)){
               password = password.replaceAll(substring,substitute);

                  System.out.println(password);
              }else {
                  System.out.println("Nothing to replace!");

              }
         }
            commandLine = scanner.nextLine();
        }

        System.out.println("Your password is: "+ password);
    }


    private static String getCharsOnOddPosition(String password){

        StringBuilder newPasswordSb =  new StringBuilder();
        for (int i = 0; i < password.length() ; i++) {

            if (i % 2 != 0){
              int  currentOddSymbol = password.charAt(i);
              newPasswordSb.append((char) currentOddSymbol);
            }

        }
        return newPasswordSb.toString();
    }
}
