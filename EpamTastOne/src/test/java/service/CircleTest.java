package service;

import by.epam.nikita.circle.service.CircleService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CircleTest {

    private static CircleService circle;

    @BeforeClass
    public static void setupStart() {
        circle = new CircleService();
    }

    @Test
    public void checkCalculateLength01(){
        int s = 100;
        double result = 628;
        Assert.assertEquals(result, circle.calculateLength(s));
    }

    @Test
    public void checkCalculateSquare02(){
        int s = 10;
        double result = 314;
        Assert.assertEquals(result, circle.calculateSquare(s));
    }

}
