package com.teachmeskills.lesson_17.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date in the format YYYY-MM-DD: ");
        String dateInput = scanner.next();

        try {
            LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE); //нашел способ в интернете
            System.out.println("Day of the week: " + date.getDayOfWeek());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }

        scanner.close();
    }
}