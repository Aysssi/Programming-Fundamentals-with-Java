package ExerLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String > schedule = Arrays
                        .stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());


        String input =scanner.nextLine();
        while (!input.equals("course start")){

            String [] commandArr = input.split(":");
            String command = commandArr[0];
            String lessonTitle = commandArr[1];
          switch (command){
              case "Add":
                 if (!schedule.contains(lessonTitle)){
                     schedule.add(lessonTitle);
                 }
                  break;
              case "Insert":
                 int index = Integer.parseInt(commandArr[2]);
                 if (!schedule.contains(lessonTitle)){
                     if (index >= 0 && index < schedule.size()){
                         schedule.add(index,lessonTitle);
                     }

                 }
                  break;
              case "Remove":
                 if (schedule.contains(lessonTitle)){
                     schedule.remove(lessonTitle);
                     schedule.remove(lessonTitle + "-Exercise");
                 }
                  break;
              case "Swap":
                  String lessonTitle2 = commandArr[2];
                  String firstLessonEx = lessonTitle +"-Exercise";
                  String secondLessonEx = lessonTitle2 +"-Exercise";
                  if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)){
                      int indexLessonTitle = schedule.indexOf(lessonTitle);
                      int indexLessonTitle2 = schedule.indexOf(lessonTitle2);

                      schedule.remove(lessonTitle);
                      schedule.remove(lessonTitle2);
                      schedule.add(indexLessonTitle,lessonTitle2);
                      schedule.add(indexLessonTitle2,lessonTitle);
                  }
                  if (schedule.contains(firstLessonEx)){
                      schedule.remove(firstLessonEx);
                      schedule.add(schedule.indexOf(lessonTitle)+1, firstLessonEx);
                  }
                  if (schedule.contains(secondLessonEx)){
                      schedule.remove(secondLessonEx);
                      schedule.add(schedule.indexOf(lessonTitle2)+1,secondLessonEx);

                  }
                  break;
              case "Exercise":
                  String exercise = lessonTitle + "-Exercise";
                  if (schedule.contains(lessonTitle) && !schedule.contains(exercise)){
                      schedule.add(schedule.indexOf(lessonTitle) + 1,exercise);
                  }else if (!schedule.contains(lessonTitle)){
                      schedule.add(lessonTitle);
                      schedule.add(exercise);
                  }
                  break;
          }
            input =scanner.nextLine();
        }
        for (int i = 1; i <= schedule.size() ; i++) {
            System.out.println(i + "." + schedule.get(i -1));
        }
    }
}
