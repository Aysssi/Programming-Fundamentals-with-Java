package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class P02ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrTarget = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int counter = 0;
        while (!command.equals("End")) {
            int shootIndex = Integer.parseInt(command);

            if (isValidIndex(arrTarget,shootIndex)) {

                for (int i = 0; i <= arrTarget.length - 1; i++) {
                    int currentIndex = arrTarget[shootIndex];

                    if (i != shootIndex && arrTarget[i] != -1) {

                        if (arrTarget[i] > currentIndex) {
                            arrTarget[i] -= currentIndex;

                        } else if (arrTarget [i] <= currentIndex ) {
                            arrTarget[i] += currentIndex;
                        }

                    }
                }

                counter++;
                arrTarget[shootIndex] = - 1;
            }
            command = scanner.nextLine();
        }


        System.out.printf("Shot targets: %d -> ", counter);
        System.out.println(Arrays.toString(arrTarget).replaceAll("[\\[\\],]", ""));
    }

    private static boolean isValidIndex(int[] arrTarget, int shootIndex) {
        return shootIndex >= 0 && shootIndex <= arrTarget.length - 1;
    }


}