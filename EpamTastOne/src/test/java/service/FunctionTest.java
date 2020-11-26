package service;

import by.epam.nikita.function.entity.Function;
import by.epam.nikita.function.service.FunctionService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class FunctionTest {
    private static FunctionService fun;

    @BeforeClass
    public static void setupStart() {
        fun = new FunctionService();
    }

    @Test
    public void checkCalculateFun01(){
        int x = 1;
        double result = -0.2;
        Assert.assertEquals(result, fun.calculateFunction(x), 0.0000001);
    }

    @Test
    public void checkCalculateFun02(){
        int x = 3;
        double result = 9;
        Assert.assertEquals(result, fun.calculateFunction(x), 0.0000001);
    }

    @Test
    public void checkCalculateFunTan03(){
        Function fun0 = new Function(1, 2, 0.5);
        List<Function> result;
        double result1 = 1.557;
        double result2 = 14.101;
        double result3 = -2.185;

        result = fun.calculateTan(fun0);
        Function objectFun;
        objectFun = result.get(0);
        Assert.assertEquals(result1, objectFun.getPointB(), 0.01);
        objectFun = result.get(1);
        Assert.assertEquals(result2, objectFun.getPointB(), 0.01);
        objectFun = result.get(2);
        Assert.assertEquals(result3, objectFun.getPointB(), 0.01);
    }
}
