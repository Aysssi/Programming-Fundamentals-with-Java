package ExerMapsLambdaAndStreamAPI;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String , ArrayList<Double>> studentsGrade = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(name)){
                studentsGrade.put(name,new ArrayList<>());
            }
            studentsGrade.get(name).add(grade);
        }
        LinkedHashMap<String,Double> students = new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<Double>> entry : studentsGrade.entrySet()) {

            String nameStudent = entry.getKey();
            List<Double> gradeList = entry.getValue();

            double averageGrade = getAverageGrade(gradeList);
            if (averageGrade >= 4.50){
                students.put(nameStudent,averageGrade);
            }

        }
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
        }


    }

    private static double getAverageGrade(List<Double> gradeList) {
        double sum = 0;
        for ( Double grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.size();
    }


}

