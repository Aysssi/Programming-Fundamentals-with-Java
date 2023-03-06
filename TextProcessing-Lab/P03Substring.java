package LabTextProcessing;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          String toRemove = scanner.nextLine();
          String secondText = scanner.nextLine();

        //ice
        //kicegiciceeb

        while (secondText.contains(toRemove)){

            secondText = secondText.replace(toRemove,"");
        }

//          int index = secondText.indexOf(toRemove);
//          while (index != -1){
//
//             secondText =  secondText.replace(toRemove,"");
//
//              index = secondText.indexOf(toRemove);
//          }

        System.out.print(secondText);
    }
}
