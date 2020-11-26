package service;

import by.epam.nikita.time.entity.Time;
import by.epam.nikita.time.service.TimeService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TimeTest {

    private static TimeService time;

    @BeforeClass
    public static void setupStart(){
        time = new TimeService();
    }


    @Test
    public void checkResultTime01(){
        //todo Ожидаемый результат и фактический результат совпадает, но при компиляции
        // выводит одинаковые данные и говорит, что они не равны
        int seconds = 3666;
        Time timeResult = new Time(1, 1, 6);
        Time expected = time.calculateTime(seconds);
        //Assert.assertEquals(timeResult,  time.calculateTime(seconds));
        Assert.assertEquals(timeResult.getHours(),  expected.getHours());
        Assert.assertEquals(timeResult.getMinutes(),  expected.getMinutes());
        Assert.assertEquals(timeResult.getSeconds(),  expected.getSeconds());
    }

}
