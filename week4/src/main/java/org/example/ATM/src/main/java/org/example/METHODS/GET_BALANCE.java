package org.example.METHODS;

import org.example.USER_DATA.USER_INFORMATION;


public class GET_BALANCE {
    public static String getBalance(String card, String password){
        String filePath = "/Users/macbook/Desktop/exampreparation/week4/src/main/java/org/example/ATM/src/main/java/org/example/USER_DATA/ATMDATA.csv";
        String fullData = USER_INFORMATION.findRowByCredentials(card, password, filePath);

        if (fullData != null) {
            String[] parts = fullData.split(",");
            if (parts.length > 2) {
                return parts[2];
            }
        }
        return "Balance not found";
    }
}
