package LabMapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Double:: parseDouble)
                        .collect(Collectors.toList());


        TreeMap<Double,Integer> countsMap = new TreeMap<>();
        for (double num : numbersList) {

            countsMap.putIfAbsent(num,0);
            int value = countsMap.get(num);
            countsMap.put(num,value +1);


//            if (!countsMap.containsKey(num)){
//                countsMap.put(num,0);
//            }
//            int value = countsMap.get(num);
//            countsMap.put(num,value + 1);


//            if (!countsMap.containsKey(num)){
//                countsMap.put(num,1);
//            }else {
//                int value = countsMap.get(num);
//                countsMap.put(num,value + 1);
//            }
        }

        for (Map.Entry<Double, Integer> entry : countsMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
