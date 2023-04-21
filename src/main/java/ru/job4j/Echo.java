package ru.job4j;

public class Echo {
    public static void transform(int number) {
            /*
            - Если число четное: - все четные цифры этого числа увеличиваются на 1
                                 - а нечетные - уменьшаются на 1.
              Если увеличение/уменьшение невозможно (например, увеличить 9),
              то оставить эту цифру без изменения.

            - Если число нечетное, то все изменения произвести наоборот - четные цифры уменьшить на 1
                                                                        - нечетные - увеличить на 1.
            Получившееся число вывести в консоль.

            Например, для числа 309 вывод будет:
            409
             */
            int num1 = number / 100;
            int num2 = number / 10 % 10;
            int num3 = Math.abs(number % 10);
            if (number % 2 == 0) {
                if (num1 % 2 == 0) {
                    num1++;
                } else {
                    if (num1 < 0) {
                        num1++;
                    } else {
                        num1--;
                    }
                }
                if (num2 % 2 == 0) {
                    num2++;
                } else {
                    num2--;
                }
                if (num3 % 2 == 0) {
                    num3++;
                } else {
                    num3--;
                }
            } else {
                if (num1 % 2 == 0) {
                    num1--;
                } else {
                    if (num1 != 9) {
                        if (num1 < 0) {
                            num1--;
                        } else {
                            num1++;
                        }
                    }
                }
                if (num2 % 2 == 0) {
                    if (num2 > 0) {
                        num2--;
                    }
                } else {
                    if (num2 != 9) {
                        num2++;
                    }
                }
                if (num3 % 2 == 0) {
                    if (num3 > 0) {
                        num3--;
                    }
                } else {
                    if (num3 != 9) {
                        num3++;
                    }
                }
            }
            if (num1 != 0) {
                System.out.format("%d%d%d\n", num1, num2, num3);
            } else {
                System.out.println(num2 * 10 + num3);
            }
    }

    public static void main(String[] args) {
        transform(390);     // 281
        transform(333);     // 444
        transform(-900);    // -811
        transform(999);     // 999
        transform(-109);    // -209
        transform(100);     // 11
    }
}