package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus10to22then3Dot60() {
        double expected = 3.60;
        Point a = new Point(-1, 0);
        Point b = new Point(2, 2);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when23to20then3() {
        double expected = 3;
        Point a = new Point(2, 3);
        Point b = new Point(2, 0);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20toMinus20then3() {
        double expected = 4;
        Point a = new Point(2, 0);
        Point b = new Point(-2, 0);
        double distance = a.distance(b);
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }
}