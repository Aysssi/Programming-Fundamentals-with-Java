package FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String destinationMappers =scanner.nextLine();

        Pattern pattern = Pattern.compile("([=|\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1");
        Matcher matcher = pattern.matcher(destinationMappers);

        List<String > destinationList = new ArrayList<>();
        int pointCount = 0;
        while (matcher.find()){
            String destination = matcher.group("destination");

            pointCount += destination.length();

//            for (int i = 0; i < destination.length(); i++) {
//               pointCount ++;
//            }

            destinationList.add(destination);
        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ", destinationList));
        System.out.println();
        System.out.println("Travel Points: "+ pointCount);
    }
}
