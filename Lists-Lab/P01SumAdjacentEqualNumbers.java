package LabLists;

import javax.xml.stream.events.DTD;
import java.awt.desktop.PreferencesEvent;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3 3 6 1  6 6 1  12 1

        List<Double>numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int index = 0; index < numbersList.size() -1; index++) {
            double currentNum = numbersList.get(index);
            double nextNum = numbersList.get(index + 1);

            if (currentNum == nextNum){
                numbersList.set(index,currentNum + nextNum);
                numbersList.remove(index + 1);
                index = -1;
            }

        }
        System.out.println(joinElementByDelimiter(numbersList, " "));

    }
    public static String joinElementByDelimiter (List<Double>list,String delimiter){

        DecimalFormat df = new DecimalFormat("0.#");

        String result = " ";
        for (double item : list) {
            String numDf = df.format(item) + delimiter;
            result += numDf;
        }
        return result;
    }

    }


