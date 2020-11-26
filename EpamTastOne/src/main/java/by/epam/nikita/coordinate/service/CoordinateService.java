package by.epam.nikita.coordinate.service;

import by.epam.nikita.coordinate.entity.Coordinate;

public class CoordinateService {

    private double compareLength(double first, double second) {
        if(first > second){
            return second;
        }
        if(first < second){
            return first;
        }
        else{
            return first;
        }

    }

    private Double calculateTheoremOfPifagore(double coordinateX, double coordinateY) {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }

    public double calculateResultPoint(Coordinate coordinateOne, Coordinate coordinateTwo){
        double firstLength = calculateTheoremOfPifagore(coordinateOne.getX(), coordinateOne.getY());
        double secondLength = calculateTheoremOfPifagore(coordinateTwo.getX(), coordinateTwo.getY());
        double result = compareLength(firstLength, secondLength);
        return result;
    }
}
