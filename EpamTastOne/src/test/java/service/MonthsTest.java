package service;

import by.epam.nikita.month.service.MonthsService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class MonthsTest {
    private static MonthsService month;

    @BeforeClass
    public static void setupStart() {
        month = new MonthsService();
    }

    @Test
    public void checkDayInMonth01(){
        String nameMonth = "FEBRUARY";
        int year = 1344;
        int result = 29;
        Assert.assertEquals(result, month.calculateDays(nameMonth, year));
    }

    @Test
    public void checkDayInMonth02(){
        String nameMonth = "FEBRUARY";
        int year = 1345;
        int result = 28;
        Assert.assertEquals(result, month.calculateDays(nameMonth, year));
    }

    @Test
    public void checkDayInMonth03(){
        String nameMonth = "JUNE";
        int year = 1344;
        int result = 30;
        Assert.assertEquals(result, month.calculateDays(nameMonth, year));
    }



}
