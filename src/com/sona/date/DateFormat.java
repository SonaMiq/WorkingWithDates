package com.sona.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

    static SimpleDateFormat userFormat = new SimpleDateFormat();

    public static void main(String[] args) {
        DateFormat dateFormat = new DateFormat();
        dateFormat.checkFormatAccept();
        System.out.println("Insert date in this format: " + userFormat.format(new Date()));
        dateFormat.compareDates();
    }

    private void compareDates() {
        boolean formatError;
        String userDate;
        int compare = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            userDate = scanner.next();
            formatError = false;
            try {
                compare = userFormat.parse(userDate).compareTo(new Date());
            } catch (ParseException e) {
                System.out.println("Insert date");
                formatError = true;
            }
        }
        while (formatError);
        if (compare < 0)
            System.out.println("Input date is before current date");
        else if (compare > 0)
            System.out.println("Input date is after current date");
        else if (compare == 0)
            System.out.println("Input date is after current date");
    }

    private void checkFormatAccept() {
        System.out.println("Insert date format");
        boolean notAccept = false;
        do {
            Scanner scanner = new Scanner(System.in);
            String format = scanner.next();
            notAccept = false;

            try {
                userFormat = new SimpleDateFormat(format);

            } catch (Exception e) {
                System.out.println("This format isn't acceptable, try again");
                notAccept = true;
            }
        }
        while (notAccept);
        System.out.println("This format is acceptable");
    }
}

