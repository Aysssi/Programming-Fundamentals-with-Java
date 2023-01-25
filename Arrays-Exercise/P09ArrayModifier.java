package ExerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int [] numbersArr = Arrays
               .stream(scanner.nextLine().split(" "))
               .mapToInt(Integer::parseInt)
               .toArray();

        // повтарящо действие -> въвеждане на команди
        // стоп: Входни данни == "end"
        // продължавам: входни данни != "end"

         //•"swap {index1} {index2}" takes two elements and swap their places.
        //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
        //•	"decrease" decreases all elements in the array with 1.

        String command = scanner.nextLine();
         while (!command.equals("end")){
              // валидна команда за изпълнение...(index е динамична стойност/променлив )
             //command = "swap {index1} {index2}"
             //command = "multiply {index1} {index2}"
             //command = "decrease"
             if  (command.contains("swap")) {
                 //"swap {index1} {index2}" -> "swap 2 3".split(" ") -> ["swap", "2", "3"]
                 int index1 = Integer.parseInt(command.split(" ")[1]); //индексът на първия елемент за размяна
                 int index2 = Integer.parseInt(command.split(" ")[2]); //индексът на втория елемент за размяна
                 //1. взимам елемента на 1-ви индекс
                 int element1 = numbersArr[index1];
                 //2. взимам елемента на 2-ри индекс
                 int element2 = numbersArr[index2];
                 //3. размяна
                 numbersArr[index1] = element2;
                 numbersArr[index2] = element1;

             }else if (command.contains("multiply")){

              int index1 = Integer.parseInt(command.split(" ")[1]);
              int index2 = Integer.parseInt(command.split(" ")[2]);
              int element1 = numbersArr[index1];
              int element2 = numbersArr[index2];

              int product = element1 * element2;
              numbersArr[index1] = product;

             }else if (command.equals("decrease")){
                 // обхождам всички елементи -> -1
                 // позиции /индекси -> 0 до последния ( дължината на масива - 1)
                 for (int i = 0; i <= numbersArr.length - 1 ; i++) {
                     numbersArr[i] -=1;
                     // numberArr[i] --;
                 }
             }
             command = scanner.nextLine();
         }
        for (int index = 0; index <= numbersArr.length -1 ; index++) {
            int currentNumber = numbersArr[index];
            if (index != numbersArr.length -1){
               //не сме на последното число
                System.out.print(currentNumber + ", ");
            }else {
                System.out.print(currentNumber);
            }
        }

    }
}
