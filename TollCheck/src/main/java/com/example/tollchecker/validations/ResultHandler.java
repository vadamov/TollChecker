package com.example.tollchecker.validations;

import com.example.tollchecker.models.Result;
import com.example.tollchecker.utils.DateUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for handling and storing the results of toll status.
 */
public class ResultHandler {
    // ANSI escape codes for colored console output
    public static final String ANSI_GREEN = "\033[32m";
    public static final String ANSI_RED = "\033[31m";
    public static final String ANSI_RESET = "\033[0m";
    // Lists to store valid and expired results
    private final List<Result> validResults = new ArrayList<>();
    private final List<Result> expiredResults = new ArrayList<>();

    /**
     * Adds a result to the specified list.
     *
     * @param numberPlate The number plate of the vehicle.
     * @param date        The date of the toll expiration date.
     * @param resultList  The list to which the result should be added.
     */
    public void addResult(String numberPlate, LocalDateTime date, List<Result> resultList) {
        resultList.add(new Result(numberPlate, date));
    }

    public void handleResult(String numberPlate, LocalDateTime date) {
        addResult(numberPlate, date, validResults);
    }

    public void handleExpiredResult(String numberPlate) {
        addResult(numberPlate, null, expiredResults);
    }

    public List<Result> getValidResults() {
        return validResults;
    }

    public List<Result> getExpiredResults() {
        return expiredResults;
    }

    /**
     * Prints the results to the console, distinguishing between valid and expired results.
     */

    public void printResults() {
        System.out.println("Expired results:");
        for (Result expiredResult : expiredResults) {
            System.out.println(ANSI_RED + expiredResult.getPlateNumber() +
                    ANSI_RESET);
        }

        System.out.println("-------------------------");

        System.out.println("Valid results:");
        for (Result validResult : validResults) {
            System.out.println(ANSI_GREEN + validResult.getPlateNumber()
                    + ANSI_RESET + " " + validResult.getDate().format(DateUtils.getFormatter()));
        }
    }

}

