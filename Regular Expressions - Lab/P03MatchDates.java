package LabRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dates =scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b(?<day>\\d{2})([.\\-\\/])(?<month>[A-Z][a-z]{2})(?:\\2)(?<year>\\d{4})\\b");
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()) {

            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n",day, month,year);
        }


    }


}
