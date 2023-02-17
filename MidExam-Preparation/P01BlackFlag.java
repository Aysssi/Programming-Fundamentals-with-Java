package MidExamPreparation;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days  = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double plunderToThisMoment = 0;
        for (int i = 1; i <= days ; i++) {
            plunderToThisMoment += dailyPlunder;
            if (i % 3 == 0 ){
              plunderToThisMoment += 0.5 * dailyPlunder;
            }
            if (i % 5 == 0){
                plunderToThisMoment = plunderToThisMoment * 0.70;
            }
        }
       if (plunderToThisMoment >= expectedPlunder){
           System.out.printf("Ahoy! %.2f plunder gained.",plunderToThisMoment);
       }else {
           System.out.printf("Collected only %.2f%% of the plunder.",plunderToThisMoment / expectedPlunder * 100);
       }
    }
}
