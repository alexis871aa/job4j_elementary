package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] array = new int[] {2, 5, 8, 15, 28, 65};
        int element = 10;
        int result = FindLoop.indexOf(array, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas8Then2() {
        int[] array = new int[] {2, 5, 8, 15, 28, 65};
        int element = 8;
        int result = FindLoop.indexOf(array, element);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}