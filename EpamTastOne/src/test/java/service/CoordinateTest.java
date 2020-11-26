package service;

import by.epam.nikita.coordinate.entity.Coordinate;
import by.epam.nikita.coordinate.service.CoordinateService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CoordinateTest {

    private static CoordinateService coordinate;

    @BeforeClass
    public static void setupStart() {
        coordinate = new CoordinateService();
    }

    @Test
    public void checkEvenNumber01(){
        Coordinate coordinateOne = new Coordinate(3, 4);
        Coordinate coordinateTwo = new Coordinate(7, 5);
        double result = 5;
        Assert.assertEquals(result,coordinate.calculateResultPoint(coordinateOne, coordinateTwo), 0.0000001);
    }

}
