package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayTo1() {
        String inRus = "Понедельник";
        String inEng = "Monday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 1;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenTuesdayTo2() {
        String inRus = "Вторник";
        String inEng = "Tuesday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 2;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenWednesdayTo3() {
        String inRus = "Среда";
        String inEng = "Wednesday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 3;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenThursdayTo4() {
        String inRus = "Четверг";
        String inEng = "Thursday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 4;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenFridayTo5() {
        String inRus = "Пятница";
        String inEng = "Friday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 5;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenSaturdayTo6() {
        String inRus = "Суббота";
        String inEng = "Saturday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 6;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenSundayTo7() {
        String inRus = "Воскресенье";
        String inEng = "Sunday";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = 7;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }

    @Test
    public void whenMistakeDayNumberToMinusOne() {
        String inRus = "Что мне делать?";
        String inEng = "What is it?";
        int resultRus = MultipleSwitchWeek.numberOfDay(inRus);
        int resultEng = MultipleSwitchWeek.numberOfDay(inEng);
        int expected = -1;
        assertThat(resultRus).isEqualTo(expected);
        assertThat(resultEng).isEqualTo(expected);
    }
}