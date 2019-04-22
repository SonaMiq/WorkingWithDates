package com.sona.date;

public class CheckYearLeap {
    public static void main(String[] args) {
        CheckYearLeap checkYearLeap=new CheckYearLeap();
        if (checkYearLeap.checkLeap())
            System.out.println("This year is leap year");
        else System.out.println("This year isn't leap year");
    }

    private boolean checkLeap() {
        CheckErrors checkErrors=new CheckErrors();
        System.out.println("Please insert year you want to check");
        int year = checkErrors.checkInsertingIntError("Please insert correct year");
        if (year <= 0) {
            System.out.println("Year must be more than zero");
            year = checkErrors.checkInsertingIntError("Please insert correct year");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }
}
