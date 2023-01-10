package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // вход username /// Acer
        // прочитаме password - която е на reversed  username --> recA
        // въвеждаме password

        String username = scanner.nextLine();
        String password = "";


// всяка позиция в текста --> от последната (дължината -1 ) ; към първата (0) знака е обърнат ; декрем
        for (int i = username.length() - 1 ; i >= 0 ; i --) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }
        // знаем каква ни е паролата

        String enteredPassword = scanner.nextLine();
        int countFailedTry = 0 ;
       

        while (!enteredPassword.equals(password)){
            
            countFailedTry++;
            if (countFailedTry == 4){
                System.out.printf  ("User %s blocked!",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");


            enteredPassword = scanner.nextLine();
        }
       
        if (enteredPassword.equals(password)){
            System.out.printf("User %s logged in.",username );
        }
    }
}



