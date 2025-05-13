package org.example.USER_DATA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class USER_INFORMATION {
    public static String findRowByCredentials(String card, String pin, String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] parts = line.trim().split(",");
                if (parts.length < 2) continue;

                String cardNumber = parts[0];
                String password = parts[1];

                if (cardNumber.equals(card) && password.equals(pin)) {
                    return line;
                }
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading CSV: " + e.getMessage());
        }

        return null;
    }
}
