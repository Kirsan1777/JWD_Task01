package by.epam.nikita.function.entity;

public class Function {
    double pointA;
    double pointB;
    double step;

    public Function(){
    }

    public Function(double pointA, double pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Function(double pointA, double pointB, double step){
        this.pointA = pointA;
        this.pointB = pointB;
        this.step = step;
    }


    public double getPointA() {
        return pointA;
    }

    public void setPointA(double pointA) {
        this.pointA = pointA;
    }

    public double getPointB() {
        return pointB;
    }

    public void setPointB(double pointB) {
        this.pointB = pointB;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return pointA + "  " + pointB;
    }
}
