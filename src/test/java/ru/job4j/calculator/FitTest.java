package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FitTest {

    @Test
    public void whenMan180Then92dot() {
        short in = 180;
        double expected = 92;
        double rsl = Fit.manWeight(in);
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(in);
        assertThat(rsl).isEqualTo(expected, offset(0.01));
    }
}