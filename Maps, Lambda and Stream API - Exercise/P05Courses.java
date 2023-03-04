package ExerMapsLambdaAndStreamAPI;

import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputData = input.split(" : ");
            String courseName = inputData[0];
            String personName = inputData[1];

            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName, new ArrayList<>());
            }
            coursesMap.get(courseName).add(personName);

            input = scanner.nextLine();
        }

       coursesMap.entrySet().stream()
               .forEach(entry -> {
                   System.out.println(entry.getKey() + ": " + entry.getValue().size());
                   entry.getValue().stream().forEach(studentName -> System.out.println("-- " + studentName));
               });

        // coursesMap.forEach((k,v)-> {
        //            System.out.printf("%s: %s%n",k, v.size());
        //            v.forEach(name -> System.out.println("-- " + name));
        //        });

    }

}