package org.example.METHODS;

import org.example.USER_DATA.USER_INFORMATION;


public class checkAvailabilityOfCard {

    public static boolean check(String card, String password) {
        String filePath = "/Users/macbook/Desktop/exampreparation/week4/src/main/java/org/example/ATM/src/main/java/org/example/USER_DATA/ATMDATA.csv";
        return USER_INFORMATION.findRowByCredentials(card, password, filePath) != null;
    }
}
