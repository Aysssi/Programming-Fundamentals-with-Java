package P02Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String [] articleData = scanner.nextLine().split(", ");
            String title = articleData[0];
            String content = articleData[1];
            String author = articleData[2];

            int number = Integer.parseInt(scanner.nextLine());

            Articles article = new Articles(title,content,author);

            for (int i = 1; i <= number ; i++) {
                String [] commandArr =scanner.nextLine().split(": ");
                String command = commandArr[0];
                String newValue = commandArr[1];

                if (command.equals("Edit")){
                  article.edit(newValue);

                } else if (command.equals("ChangeAuthor")) {
                    article.changeAuthor(newValue);

                } else if (command.equals("Rename")) {
                   article.rename(newValue);

                }

            }
            System.out.println(article.toString());


        }
    }
