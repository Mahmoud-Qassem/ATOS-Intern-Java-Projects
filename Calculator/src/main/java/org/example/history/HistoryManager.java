package org.example.history;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoryManager {
    private static List<String> history = new ArrayList<>();

    public static void addHistoryRecord(String record) {
        history.add(record);
    }

    public static List<String> getHistory() {
        return history;
    }

    public static void clearHistory() {
        history.clear();
    }

    public static void saveHistory() {
        try (java.io.FileWriter writer = new java.io.FileWriter("history.txt")) {
            for (String record : history) {
                writer.write(record + "\n");
            }
        } catch (Exception e) {
            System.err.println("Error saving history: " + e.getMessage());
        }
    }


    public static void loadHistory(String filePath) {
        history.clear(); // optional: clear old history before loading

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
