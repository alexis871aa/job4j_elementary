package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void whenDayIsMonday() {
        int in = 1;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Понедельник.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIsTuesday() {
        int in = 2;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Вторник.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIsWednesday() {
        int in = 3;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Среда.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIsThursday() {
        int in = 4;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Четверг.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIsFriday() {
        int in = 5;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Пятница.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIsSaturday() {
        int in = 6;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Суббота.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenDayIsSunday() {
        int in = 7;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Воскресенье.";
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenNotDayOfWeek() {
        int in = 10;
        String rsl = SwitchWeek.nameofDay(in);
        String expected = "Ошибка.";
        assertThat(rsl).isEqualTo(expected);
    }
}