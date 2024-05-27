package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart10Finish5Then0() {
        int result = Counter.sum(10, 5);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart4Finish15Then114() {
        int result = Counter.sum(4, 15);
        int expected = 114;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart4Finish8Then30() {
        int result = Counter.sum(4, 8);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To15Then56() {
        int start = 1;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10To20Then90() {
        int start = -10;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 80;
        assertThat(result).isEqualTo(expected);
    }

}