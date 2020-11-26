package by.epam.nikita.square.service;

public class SquareInCircleService {//todo результат должен быть меньше в два раза от изначальной площади, это или формулы или просто делить на 2?

    private double calculateSideOfSquare(double area){
        return Math.sqrt(area);
    }

    private double calculateArea(double side) {
        side = side * Math.sqrt(2) / 2;
        return Math.pow(side, 2);
    }

    public double calculateTheDifference(double firstArea){
        double second = calculateArea(calculateSideOfSquare(firstArea));
        return firstArea/second;
    }


}
