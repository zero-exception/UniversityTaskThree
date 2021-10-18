package net.snezhniy.task1;

public class Calculator<T extends Number> {
    T a;
    T b;

    public Calculator(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a.doubleValue() + b.doubleValue();
    }

    public double diff() {
        return a.doubleValue() - b.doubleValue();
    }

    public double multiply() {
        return a.doubleValue() * b.doubleValue();
    }
}
