package by.epam.nikita.validator;

import by.epam.nikita.exception.NumberException;

public class NumberValidator {


    public Integer validateIntInRange(int number, int min, int max) throws NumberException {

            if (number <= max && number >= min) {
                return number;
            }
        throw new NumberException("Input correct number");
    }

    public Integer validateIntMax(int number, int max) throws NumberException {

        if (number <= max) {
            return number;
        }
        throw new NumberException("Input correct number");
    }

    public Integer validateIntMin(int number, int min) throws NumberException {

        if (number >= min) {
            return number;
        }
        throw new NumberException("Input correct number");
    }

    public double validateDoubleInRange(double number, double min, double max) throws NumberException {

        if (number <= max && number >= min) {
            return number;
        }
        throw new NumberException("Input correct number");
    }

    public double validateDoubleMax(double number, double max) throws NumberException {

        if (number <= max) {
            return number;
        }
        throw new NumberException("Input correct number");
    }

    public double validateDoubleMin(double number, double min) throws NumberException {

        if (number >= min) {
            return number;
        }
        throw new NumberException("Input correct number");
    }



}
