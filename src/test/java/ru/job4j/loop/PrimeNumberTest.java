package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    public void when5Then3() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when11Then5() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2Then1() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when37Then12() {
        int finish = 38;
        int result = PrimeNumber.calc(finish);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when110Then29() {
        int finish = 110;
        int result = PrimeNumber.calc(finish);
        int expected = 29;
        assertThat(result).isEqualTo(expected);
    }
}