package org.example.Logs;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static List<Logs> filterByDate(List<Logs> logs, LocalDate start, LocalDate end) {
        return logs.stream()
                .filter(t -> !t.getDateTime().toLocalDate().isBefore(start) && !t.getDateTime().toLocalDate().isAfter(end))
                .collect(Collectors.toList());
    }

    public static List<Logs> filterByEmployee(List<Logs> logs, int employeeId) {
        return logs.stream()
                .filter(t -> t.getEmployeeId() == employeeId)
                .collect(Collectors.toList());
    }

    public static List<Logs> filterByAccount(List<Logs> transactions, String accountNumber) {
        return transactions.stream()
                .filter(t -> t.getAccountNumber().equals(accountNumber))
                .collect(Collectors.toList());
    }
}

