package net.snezhniy.task2;

public class Trichisla {
    int a;
    int b;
    int c;

    public Trichisla(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum() {
        return Math.addExact(a, Math.addExact(b, c));
    }

    public int multiply() {
        return Math.multiplyExact(a, Math.multiplyExact(b, c));
    }

    public int max() {
        return Math.max(a, Math.max(b, c));
    }
}
