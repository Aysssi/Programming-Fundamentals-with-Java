package ExerLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;

        //повтарям : въвеждам индекс
        //стоп: списъка стане празен -> numbers.size <= 0
        //продължавам: списъка е пълен ->numbers. size > 0


        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= numbers.size() - 1) {
                //1. взимам елемента на дадения индекс
                int removedElement = numbers.get(index);
                //2. премахвам елемента от този индекс -> сумирам елемента
                sumRemoved += removedElement;
                numbers.remove(index);
                //3. модифицирам списъка спрямо премахнатото число
                //{3, 4, 8, 9, 12}
                modifyList(numbers, removedElement);
            }

            else if (index < 0) {

                int firstElement = numbers.get(0);

                sumRemoved += firstElement;
                numbers.remove(0);

                int lastElement = numbers.get(numbers.size() - 1);

                numbers.add(0, lastElement);
                //5. модифицирам списъка спрямо премахнатия елемент
                //{3, 4, 8, 9, 12}
                modifyList(numbers, firstElement);
            }

            else if (index > numbers.size() - 1) {

                int lastElement = numbers.get(numbers.size() - 1);

                sumRemoved += lastElement;
                numbers.remove(numbers.size() - 1);

                int firstElement = numbers.get(0);

                numbers.add(firstElement);
                //5. модифицирам списъка -> премахнатия елемент (lastElement)
                modifyList(numbers, lastElement);

            }

        }

        System.out.println(sumRemoved);

    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int indexInList = 0; indexInList <= numbers.size() - 1; indexInList++) {
            int currentNumber = numbers.get(indexInList);

            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            numbers.set(indexInList, currentNumber);
        }
    }
}