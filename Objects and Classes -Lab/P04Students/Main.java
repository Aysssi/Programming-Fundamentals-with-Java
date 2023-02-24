package P04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        List<Student> studentList =new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            String [] studentData = scanner.nextLine().split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);

            Student currentStudent = new Student( firstName,lastName,grade);
            studentList.add(currentStudent);
        }
        studentList.sort(Comparator.comparingDouble(Student :: getGrade).reversed());

        for ( Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
