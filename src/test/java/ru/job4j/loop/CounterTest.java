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
    void whenStart4Finish5Then5() {
        int result = Counter.sum(4, 8);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

}