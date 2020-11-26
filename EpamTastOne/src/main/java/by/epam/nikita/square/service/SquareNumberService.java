package by.epam.nikita.square.service;

public class SquareNumberService {

    private int checkLastNumber(int number){
        int lastNumber;
        lastNumber = number % 10;
        return lastNumber;
    }

    public double calculateSquareLastNumber(int number){
        int lastNumber = checkLastNumber(number);
        return Math.pow(lastNumber, 2);
    }

}
