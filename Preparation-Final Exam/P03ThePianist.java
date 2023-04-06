package FinalExamPreparation;

import java.util.*;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap< String,List <String>>  piecesMap = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String [] dataArr = scanner.nextLine().split("\\|");
            String piece = dataArr[0];
            String composer = dataArr[1];
            String key = dataArr[2];

            List<String > piecesInfoList = new ArrayList<>();
            piecesInfoList.add(composer);
            piecesInfoList.add(key);

            piecesMap.put(piece,piecesInfoList);
        }

        String  commandLine = scanner.nextLine();
        while (!commandLine.equals("Stop")){
            String [] commandArr = commandLine.split("\\|");
            String command = commandArr[0];
            String piece = commandArr[1];

            switch (command){
                case "Add":
                    String composer = commandArr[2];
                    String key = commandArr[3];
                    if (!piecesMap.containsKey(piece)){
                          List<String> addPiecesInfo = new ArrayList<>();
                          addPiecesInfo.add(composer);
                          addPiecesInfo.add(key);
                          piecesMap.put(piece,addPiecesInfo);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }   else {
                        System.out.printf("%s is already in the collection!%n",piece);
                    }
                    break;
                case "Remove":
                      if(piecesMap.containsKey(piece)){
                          piecesMap.remove(piece);
                          System.out.printf("Successfully removed %s!%n",piece);
                      }else {
                          System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                      }
                    break;
                case "ChangeKey":
                    String newKey = commandArr[2];
                    if (piecesMap.containsKey(piece)){
                        List<String > currentPiecesInfo = piecesMap.get(piece);
                        currentPiecesInfo.remove(1);
                        currentPiecesInfo.add(newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);

                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
            }


            commandLine = scanner.nextLine();
        }


         piecesMap.entrySet()
                 .forEach(entry-> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));

    }
}
