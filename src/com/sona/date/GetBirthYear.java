package com.sona.date;

import java.time.LocalDate;

public class GetBirthYear {
    public static void main(String[] args) {
        GetBirthYear getBirthYear = new GetBirthYear();
        int birthYear = getBirthYear.askAge();
        System.out.println("You born in " + birthYear);
    }

    private int askAge() {
        CheckErrors checkErrors=new CheckErrors();
        System.out.println("Please insert your age");
        int age = checkErrors.checkInsertingIntError("Please insert correct age");
        if (age <= 0) {
            System.out.println("Age must be more than zero");
            age = checkErrors.checkInsertingIntError("Please insert correct age");
        }
        int thisYear = LocalDate.now().getYear();
        int birthYear = thisYear - age;
        return birthYear;
    }
}


