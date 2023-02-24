package P06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> peopleList =new ArrayList<>();
        while (!input.equals("End")){
            String [] personData =  input.split(" ");
            String name = personData[0];
            String id = personData[1];
            int age = Integer.parseInt(personData[2]);

            Person currentPerson = new Person(name,id,age);
            peopleList.add(currentPerson);

            input = scanner.nextLine();
        }
        peopleList.sort(Comparator.comparingInt(Person :: getAge));

        for (Person person : peopleList) {
            System.out.println(person.toString());
        }
    }
}
