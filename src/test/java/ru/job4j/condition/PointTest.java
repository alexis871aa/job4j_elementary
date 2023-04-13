package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when11To23Then2dot24() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double expected = 2.24;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when54To27Then4dot24() {
        int x1 = 5;
        int y1 = 4;
        int x2 = 2;
        int y2 = 7;
        double expected = 4.24;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when32To51Then2dot24() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 5;
        int y2 = 1;
        double expected = 2.24;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}