package ExerMapsLambdaAndStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> companyUserMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] companyUserArr = input.split(" -> ");
            String company = companyUserArr[0];
            String employeeId = companyUserArr[1];

            if (!companyUserMap.containsKey(company)){
                companyUserMap.put(company,new ArrayList<>());
                companyUserMap.get(company).add(employeeId);

            }else {
              if (!companyUserMap.get(company).contains(employeeId)){
                  companyUserMap.get(company).add(employeeId);
              }
            }


            input = scanner.nextLine();
        }

        companyUserMap.forEach((k,v) -> {
            System.out.println(k);
            v.forEach(id -> System.out.println("-- " + id));
        });

//        for (Map.Entry<String, ArrayList<String>> entry : companyUserMap.entrySet()) {
//            System.out.printf("%s%n", entry.getKey());
//            for (String id : entry.getValue()) {
//                System.out.printf("-- %s%n",id);
//            }
//        }

    }
}