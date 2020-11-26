package by.epam.nikita.month.service;

import by.epam.nikita.month.entity.Months;

public class MonthsService {

    public int calculateDays(String month, int year) {
        try {
            Months months = Months.valueOf(month);
            int days = months.getDays();
            if (months == Months.FEBRUARY && checkLeapYear(year)) {
                days++;
            }
            return days;
        } catch (IllegalArgumentException ex) {
            System.out.println("We have some problem");
            return -1;
        }
    }

    private boolean checkLeapYear(int year) {
        int leapYearCounter = 4;
        int nonLeapYearCounter = 100;
        int specialLeapYearCounter = 400;
        if (year % leapYearCounter == 0 && year % nonLeapYearCounter != 0)
            return true;
        else return year % specialLeapYearCounter == 0;
    }

}
