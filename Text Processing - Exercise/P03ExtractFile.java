package ExerTextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] pathFileArr = scanner.nextLine().split("\\\\");

        String fullNameFile = pathFileArr[pathFileArr.length -1];
        String [] fullNameFileArr = fullNameFile.split("\\.");
        String fileName = fullNameFileArr[0];
        String fileExtension = fullNameFileArr[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
