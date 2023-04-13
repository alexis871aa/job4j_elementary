package ru.job4j.converter;

public class Converter {
    private static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    private static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(in);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        float expectedDollar = 2.3333333f;
        float outDollar = Converter.rubleToDollar(in);
        passed = expectedDollar == outDollar;
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed);
    }
}