package com.example.tollchecker.models;

import java.time.LocalDateTime;

public class Result {
    private String plateNumber;
    private LocalDateTime date;

    public Result(String plateNumber, LocalDateTime date) {
        this.plateNumber = plateNumber;
        this.date = date;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
