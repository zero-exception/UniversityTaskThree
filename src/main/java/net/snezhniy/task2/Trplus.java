package net.snezhniy.task2;

import java.util.stream.Stream;

public class Trplus extends Trichisla {
    public Trplus(Integer a, Integer b, Integer c) {
        super(a, b, c);
    }

    public boolean isValidTriangle() {
        return Math.addExact(a, b) > c && Math.addExact(b, c) > a && Math.addExact(c, a) > b;
    }

    public Stream<Integer> sortedStream() {
        return Stream.of(a, b, c).sorted();
    }
}
