package P03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

          int number =  Integer.parseInt(scanner.nextLine());
         List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= number ; i++) {
            String[] personData = scanner.nextLine().split(" ");
            String  name = personData[0];
            int age = Integer.parseInt(personData[1]);

            if (age > 30){
                Person person = new Person(name,age);
                peopleList.add(person);

            }
        }
        for ( Person person : peopleList) {
            System.out.println(person.toString());
        }


    }
}