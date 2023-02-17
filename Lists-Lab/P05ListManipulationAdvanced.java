package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer>numbersList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String inputLine = scanner.nextLine();


        while (!inputLine.equals("end")){
            String [] commandArr = inputLine.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Contains":
                    int numToContains = Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(numToContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondCommand = commandArr[1];
                    
                    if (secondCommand.equals("even")){
                        for (int index = 0; index < numbersList.size(); index++) {
                           int currentNum = numbersList.get(index) ;
                           String  evenSum = " ";
                           if (currentNum % 2 == 0){
                               evenSum +=currentNum + "";
                               System.out.print(evenSum);
                           }

                        }
                        System.out.println();
                    } else if (secondCommand.equals("odd")) {
                        for (int index = 0; index < numbersList.size(); index++) {
                            int currentNum = numbersList.get(index) ;
                            String  oddSum = " ";
                            if (currentNum % 2 != 0){
                                oddSum +=currentNum + "";
                                System.out.print(oddSum);
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                int sum = 0;
                    for (int index = 0; index <numbersList.size() ; index++) {
                        int currentNum = numbersList.get(index);
                        sum += currentNum;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":

                    String condition = commandArr[1];
                    int number = Integer.parseInt(commandArr[2]);
                  if (condition.equals("<")){
                      for (int index = 0; index < numbersList.size(); index++) {
                          int currentNum = numbersList.get(index);
                          if (currentNum < number){
                              System.out.print(currentNum + " ");
                          }
                      }
                      System.out.println();
                  } else if (condition.equals(">")) {
                      for (int index = 0; index < numbersList.size(); index++) {
                          int currentNum = numbersList.get(index);
                          if (currentNum > number){
                              System.out.print(currentNum + " ");
                          }
                      }
                      System.out.println();
                  } else if (condition.equals(">=")) {
                      for (int index = 0; index < numbersList.size(); index++) {
                          int currentNum = numbersList.get(index);
                          if (currentNum >= number){
                              System.out.print(currentNum + " ");
                          }
                      }
                      System.out.println();
                  } else if (condition.equals("<=")) {
                      for (int index = 0; index < numbersList.size(); index++) {
                          int currentNum = numbersList.get(index);
                          if (currentNum <= number){
                              System.out.print(currentNum + " ");
                          }
                      }
                      System.out.println();
                  }
                    break;
                }
            inputLine =scanner.nextLine();
            }



        }
    }


