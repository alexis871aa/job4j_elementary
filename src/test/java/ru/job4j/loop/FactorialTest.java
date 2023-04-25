package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {
    @Test
    public void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor1Then1() {
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor5Then120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialFor8Then40320() {
        int n = 8;
        int result = Factorial.calc(n);
        int expected = 40320;
        assertThat(result).isEqualTo(expected);
    }
}