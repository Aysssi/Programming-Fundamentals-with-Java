package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       int peopleInQueue =Integer.parseInt(scanner.nextLine());

       List<Integer> liftInCabins = Arrays
                       .stream(scanner.nextLine().split("\\s+"))
                       .map(Integer::parseInt)
                       .collect(Collectors.toList());

        for (int index = 0; index < liftInCabins.size(); index++) {

             if (peopleInQueue > 0 ){
                 int currentCountPeople = liftInCabins.get(index);

                 while (currentCountPeople < 4){

                     if (peopleInQueue <= 0 ){
                         break;
                     }
                     currentCountPeople ++;
                     liftInCabins.set(index,currentCountPeople);
                     peopleInQueue --;
                 }
             }
        }

        if (peopleInQueue <= 0 && liftInCabins.get(liftInCabins.size() - 1) < 4){
            System.out.println("The lift has empty spots!");
        } else if (peopleInQueue > 0 && liftInCabins.get(liftInCabins.size() - 1) >= 4) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",peopleInQueue);
        }

        System.out.println(liftInCabins.toString().replaceAll("[\\[\\],]", ""));
    }
}
