package com.sona.date;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CheckErrors {

    public int checkInsertingIntError(String message) {
        boolean error = false;
        int value = 0;
        do {
            error = false;
            try {
                Scanner scanner = new Scanner(System.in);
                value = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(message);
                error = true;
            }
        }
        while (error);
        return value;
    }
}
