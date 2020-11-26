package service;

import by.epam.nikita.square.service.SquareInCircleService;
import by.epam.nikita.square.service.SquareNumberService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SquareTest {

    private static SquareInCircleService square;
    private static SquareNumberService squareNumber;

    @BeforeClass
    public static void setup(){
        square = new SquareInCircleService();
    }

    @BeforeClass
    public static void setupStart(){
        squareNumber = new SquareNumberService();
    }

    @Test
    public void calculateSquare01(){
        int s = 16;
        double result = 2;
        Assert.assertEquals(result, square.calculateTheDifference(s), 0.0000001);
    }

    @Test
    public void calculateSquare02(){
        int x = 16;
        double result = 36;
        Assert.assertEquals(result, squareNumber.calculateSquareLastNumber(x), 0.000001);
    }

}
