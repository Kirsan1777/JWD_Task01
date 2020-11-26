package validator;

import by.epam.nikita.exception.NumberException;
import by.epam.nikita.validator.NumberValidator;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidatorTest {
    public static NumberValidator validator;

    @BeforeClass
    public static void setup() {
        validator = new NumberValidator();
    }

    @Test
    public void validateIntInRange01() {
        try {
            int min = 1;
            int max = 10;
            int number = 3;
            int res = validator.validateIntInRange(number, min, max);
            Assert.assertEquals(res, 3);
        } catch(NumberException ex) {
            System.out.println("Error");
        }
    }


    @Test(expectedExceptions = NumberException.class)
    public void validateIntInRange02() throws NumberException {
        int number = -2;
        int min = 1;
        int max = 10;
        validator.validateIntInRange(number, min, max);
    }


    @Test
    public void validateIntMin03() {
        try {
            int min = 1;
            int number = 3;
            int res = validator.validateIntMin(number, min);
            Assert.assertEquals(res, 3);
        } catch(NumberException ex) {
            System.out.println("Error");
        }
    }


    @Test(expectedExceptions = NumberException.class)
    public void validateIntMin04() throws NumberException {
        int number = -2;
        int min = 1;
        validator.validateIntMin(number, min);
    }

    @Test
    public void validateIntMax05() {
        try {
            int max = 10;
            int number = 3;
            int res = validator.validateIntMax(number, max);
            Assert.assertEquals(res, 3);
        } catch(NumberException ex) {
            System.out.println("Error");
        }
    }


    @Test(expectedExceptions = NumberException.class)
    public void validateIntMax06() throws NumberException {
        int number = 200;
        int max = 10;
        validator.validateIntMax(number, max);
    }

    @Test
    public void validateDoubleInRange01() {
        try {
            double min = 1.3;
            double max = 10.6;
            double number = 3.5;
            double res = validator.validateDoubleInRange(number, min, max);
            Assert.assertEquals(res, 3.5, 0.00001);
        } catch(NumberException ex) {
            System.out.println("Error");
        }
    }


    @Test(expectedExceptions = NumberException.class)
    public void validateDoubleInRange02() throws NumberException {
        double number = -2.9;
        double min = 1.1;
        double max = 10.6;
        validator.validateDoubleInRange(number, min, max);
    }


    @Test
    public void validateDoubleMin03() {
        try {
            double min = 1.3;
            double number = 3.5;
            double res = validator.validateDoubleMin(number, min);
            Assert.assertEquals(res, 3.5, 0.000001);
        } catch(NumberException ex) {
            System.out.println("Error");
        }
    }


    @Test(expectedExceptions = NumberException.class)
    public void validateDoubleMin04() throws NumberException {
        double number = -2.2;
        double min = 1.1;
        validator.validateDoubleMin(number, min);
    }

    @Test
    public void validateDoubleMax05() {
        try {
            double max = 10.2;
            double number = 3.5;
            double res = validator.validateDoubleMax(number, max);
            Assert.assertEquals(res, 3.5, 0.000001);
        } catch(NumberException ex) {
            System.out.println("Error");
        }
    }


    @Test(expectedExceptions = NumberException.class)
    public void validateDoubleMax06() throws NumberException {
        double number = 200.65;
        double max = 10.1;
        validator.validateDoubleMax(number, max);
    }
}
