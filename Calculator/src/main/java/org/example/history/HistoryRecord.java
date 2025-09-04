package org.example.history;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class HistoryRecord {
    private double result;
    private String operationName;
    private double[] operands;
    private LocalDateTime timestamp;

    public HistoryRecord(double result, String operationName, double[] operands, LocalDateTime timestamp) {
        this.result = result;
        this.operationName = operationName;
        this.operands = operands;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // format date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");
        String formattedTimestamp = timestamp.format(formatter);
        sb.append(formattedTimestamp).append(" | ");

        sb.append(operationName).append(" (");

        for (int i = 0; i < operands.length; i++) {
            sb.append(operands[i]);
            if (i < operands.length - 1) sb.append(", ");
        }
        sb.append(") = ").append(result);

        return sb.toString();
    }
}
