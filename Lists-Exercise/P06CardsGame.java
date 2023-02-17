package ExerLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());


        List<Integer> secondPlayerList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());


        // взимам първата карта от ръката на firstPlayerList и secondPlayerList
        // премахвам картата от ръката на firstPlayerList и secondPlayerList
        // провека firstPlayerList > secondPlayerList -> слагам накрая на ръката на първия -> карта 1 ->карта 2
        // провека secondPlayerList > firstPlayerList -> слагам накрая на ръката на втория -> карта 2 ->карта 1
        // играта продължава, когато и двамата имат карти
        // играта спира, когато някой остане без карти

          while (firstPlayerList.size() != 0 && secondPlayerList.size() != 0){
              int firstPlayerCard = firstPlayerList.get(0);
              int secondPlayerCard = secondPlayerList.get(0);

              firstPlayerList.remove(0);
              secondPlayerList.remove(0);

              if (firstPlayerCard > secondPlayerCard){
                  firstPlayerList.add(firstPlayerCard);
                  firstPlayerList.add(secondPlayerCard);
              } else if (secondPlayerCard > firstPlayerCard) {
                  secondPlayerList.add(secondPlayerCard);
                  secondPlayerList.add(firstPlayerCard);
              }

          }
        if (firstPlayerList.size() == 0){
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondPlayerList));
        } else if (secondPlayerList.size() == 0) {
            System.out.printf("First player wins! Sum: %d",getCardsSum(firstPlayerList));
        }
    }

    private static int getCardsSum(List<Integer>listCards) {

        int sum = 0;
        for (int card : listCards ) {
            sum += card;
        }
        return sum;
    }
}
