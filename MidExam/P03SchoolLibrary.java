package Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> booksLibrary = Arrays
                        .stream(scanner.nextLine().split("&"))
                        .collect(Collectors.toList());


       String commandLine = scanner.nextLine();

          while (!commandLine.equals("Done")){
              String[] commandArr = commandLine.split(" \\| ");
              String command = commandArr [0];

             switch (command){

                 case "Add Book":
                   String addNameBook = commandArr[1];
                   if (!booksLibrary.contains(addNameBook)){
                       booksLibrary.add(0,addNameBook);
                   }

                     break;
                 case"Take Book":
                     String takeBookName  = commandArr[1];

                     booksLibrary.remove(takeBookName);

                     break;
                 case "Swap Books":

                     String  bookFist = commandArr[1];
                     String bookSecond = commandArr[2];

                     if (booksLibrary.contains(bookFist) && booksLibrary.contains(bookSecond)){
                         int indexBookFist = booksLibrary.indexOf(bookFist);
                         int indexBookSecond = booksLibrary.indexOf(bookSecond);
                         Collections.swap(booksLibrary,indexBookFist,indexBookSecond);
                     }

                     break;
                     case "Insert Book":
                         String insertBookName = commandArr[1];

                         if (!booksLibrary.contains(insertBookName)){
                             booksLibrary.add(insertBookName);
                         }
                     break;
                 case "Check Book":
                   int index = Integer.parseInt(commandArr[1]);

                   if (isValidIndex (booksLibrary,index)){
                    String  indexBook =  booksLibrary.get(index);
                       System.out.println(indexBook);

                   }
                     break;


             }



              commandLine = scanner.nextLine();
          }
        System.out.println(String.join(", ", booksLibrary));
    }

    private static boolean isValidIndex(List<String> booksLibrary, int index) {

        return index >= 0 && index < booksLibrary.size();
    }
}
