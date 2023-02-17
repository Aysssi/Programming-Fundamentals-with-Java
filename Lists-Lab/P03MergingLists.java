package LabLists;

import java.util.*;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> fistList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList =Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();




        int minSize = Math.min(fistList.size(),secondList.size());

        for (int index = 0; index < minSize; index++) {
            int numFirstList = fistList.get(index);
            int numSecondList = secondList.get(index);

            resultList.add(numFirstList);
            resultList.add(numSecondList);


        }
        if (fistList.size() > secondList.size()){
            resultList.addAll(fistList.subList(minSize,fistList.size()));
        }else {
            resultList.addAll(secondList.subList(minSize,secondList.size()));
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
