package com.example.tollchecker.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    public static LocalDateTime parseDate(String dateText) {
        return LocalDateTime.parse(dateText, FORMATTER);
    }

    public static DateTimeFormatter getFormatter() {
        return FORMATTER;
    }
}