package org.example.METHODS;

import org.example.ENUM.CARD_INFO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GET_CASH {

    public static void writeToDatabase(String card, String password, String newBalance) {
        String filePath = "/Users/macbook/Desktop/exampreparation/week4/src/main/java/org/example/ATM/src/main/java/org/example/USER_DATA/ATMDATA.csv";

        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    updatedLines.add(line); // Keep the header
                    isHeader = false;
                    continue;
                }

                String[] parts = line.trim().split(",");

                String cardFromFile = parts[CARD_INFO.CARD_NUMBER.getIndex()];
                String pinFromFile = parts[CARD_INFO.PIN.getIndex()];

                if (cardFromFile.equals(card) && pinFromFile.equals(password)) {
                    // ✅ Update balance
                    parts[CARD_INFO.BALANCE.getIndex()] = newBalance;
                    line = String.join(",", parts);
                }

                updatedLines.add(line); // Add updated or unchanged line
            }

        } catch (IOException e) {
            System.out.println("❌ Error reading: " + e.getMessage());
            return;
        }

        // ✅ Write back to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String updatedLine : updatedLines) {
                bw.write(updatedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("❌ Error writing: " + e.getMessage());
        }
    }
}
