package by.epam.nikita.function.service;

import by.epam.nikita.function.entity.Function;

import java.util.ArrayList;
import java.util.List;

public class FunctionService {

    public Double calculateFunction(int x) {

        if(x >= 3) {
            return XMoreThree(x);
        }
        return XLessThree(x);
    }

    private double XMoreThree(double x) {

        return 9 + 3*x - Math.pow(x, 2);
    }

    private double XLessThree(double x) {

        return 1. / (Math.pow(x, 3) - 6);
    }

    public List<Function> calculateTan(Function fun){

        List<Function> list = new ArrayList<Function>();
        double pointA = fun.getPointA();
        double pointB = fun.getPointB();
        double step = fun.getStep();

        for(; pointA <= pointB; pointA += step){
            list.add(new Function(pointA, Math.tan(pointA)));
        }
        return list;
    }

}
