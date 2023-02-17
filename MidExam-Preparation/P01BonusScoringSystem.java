package MidExamPreparation;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = 0;
        double maxStudentsAttendances = 0;
        for (int students = 0; students < countStudents; students++) {
            int currentStudentsAttendances = Integer.parseInt(scanner.nextLine());

            double currentBonus = (currentStudentsAttendances * 1.0/ countLectures) * (5 + additionalBonus);

            if (currentBonus > maxBonus){
                maxBonus = currentBonus;
                maxStudentsAttendances = currentStudentsAttendances;
            }
        }


        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.",maxStudentsAttendances);

    }
}
