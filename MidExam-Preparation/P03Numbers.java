package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());



        double sum = 0;
        for (int index = 0; index < numberList.size() ; index++) {
           int currentNum = numberList.get(index);
           sum += currentNum;
        }

        double average = sum / numberList.size() ;

        List <Integer> topNumbers = new ArrayList<>();

        for (int j = 0; j < numberList.size(); j++) {
            int currentNum = numberList.get(j);
            if (currentNum > average){
                topNumbers.add(currentNum);
            }
        }

        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);
        if (topNumbers.size() > 5){
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        }else if (topNumbers.isEmpty()){
            System.out.println("No");
        }else {
            System.out.println(topNumbers.toString().replaceAll("[\\[\\],]",""));
        }

    }
}
