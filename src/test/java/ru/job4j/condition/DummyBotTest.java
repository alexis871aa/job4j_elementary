package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = new String("Hi, Bot.");
        String result = DummyBot.answer(in);
        String expected = new String("Hi, SmartAss.");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = new String("Bye.");
        String result = DummyBot.answer(in);
        String expected = new String("See you later.");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = new String("Can you add two plus two?");
        String result = DummyBot.answer(in);
        String expected = new String("I don't know. Please, ask another question.");
        assertThat(result).isEqualTo(expected);
    }
}