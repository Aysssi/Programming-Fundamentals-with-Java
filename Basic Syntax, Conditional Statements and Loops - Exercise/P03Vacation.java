package ExerBasicSyntaxConditionStatementsAndLoop;


import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int countPeople = Integer.parseInt(scanner.nextLine());
       String  typeGroup = scanner.nextLine();
       String  dayOfTheWeek = scanner.nextLine();

       double price = 0;
       if (dayOfTheWeek.equals("Friday")){
           if (typeGroup.equals("Students")){
              price = 8.45;
              if (countPeople >= 30){
                  price = price * 0.85;
              }
           } else if (typeGroup.equals("Business")) {
               price = 10.90;
               if (countPeople >= 100){
                   countPeople = countPeople - 10;
               }
           } else if (typeGroup.equals("Regular")) {
               price = 15;
               if (countPeople >= 10 && countPeople <= 20){
                   price = price * 0.95;
               }
           }
       } else if (dayOfTheWeek.equals("Saturday")) {
           if (typeGroup.equals("Students")){
               price = 9.80;
               if (countPeople >= 30){
                   price = price * 0.85;
               }
           } else if (typeGroup.equals("Business")) {
               price = 15.60;
               if (countPeople >= 100){
                   countPeople = countPeople - 10;
               }
           } else if (typeGroup.equals("Regular")) {
               price = 20;
               if (countPeople >= 10 && countPeople <= 20){
                   price = price * 0.95;
               }
           }
       } else if (dayOfTheWeek.equals("Sunday")) {
           if (typeGroup.equals("Students")){
               price = 10.46;
               if (countPeople >= 30){
                   price = price * 0.85;
               }
           } else if (typeGroup.equals("Business")) {
               price = 16;
               if (countPeople >= 100){
                   countPeople = countPeople - 10;
               }
           } else if (typeGroup.equals("Regular")) {
               price = 22.50;
               if (countPeople >= 10 && countPeople <= 20){
                   price = price * 0.95;
               }
           }
       }

       double total =  price * countPeople;
        System.out.printf("Total price: %.2f",total );
    }
}
