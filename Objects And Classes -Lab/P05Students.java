package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

     static class Student{
         private String firstName;
         private String lastName;
         private int age;
         private String town;

         public Student(String firstName, String lastName, int age, String town) {
             this.firstName = firstName;
             this.lastName = lastName;
             this.age = age;
             this.town = town;
         }

         public String getFirstName() {
             return this. firstName;
         }

         public String getLastName() {
             return this. lastName;
         }

         public int getAge() {
             return this. age;
         }

         public String getTown() {
             return this.town;
         }
     }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();

         List<Student> studentsList = new ArrayList<>();
         while (!input.equals("end")){
            String [] arrStudent = input.split("\\s+");
             String fistName = arrStudent[0];
             String lastName = arrStudent[1];
             int age = Integer.parseInt(arrStudent[2]);
             String town = arrStudent[3];

             Student currentStudent = new Student(fistName,lastName,age,town);
             studentsList.add(currentStudent);

             input = scanner.nextLine();
         }
         String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getLastName(),item.getAge());
            }

        }
    }
}

