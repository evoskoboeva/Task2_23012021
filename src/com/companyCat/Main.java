package com.companyCat;

import java.util.Scanner;
import java.util.function.Function;

public class Main {

    public static <Char, Int> void main(String[] args) {
        /**
        *переменная z1 для выбора примера для расчета
         */
        int z1 = 0;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 2"+System.lineSeparator());
            System.out.println("1. a = 3х + 2 -7");
            System.out.println("2. b = 4х*3 - 12");
            System.out.println("3. c = х*(-3 + 2) + 1");
            System.out.println("4. d = (х - 2)*122");
            System.out.println("5. e = (х + 4)*(485 - 179)");
            System.out.println("6. f = 3 + 9х - 5/х - 1");
            System.out.println("7. g = 2,5*(4 - 6х) -5");
            System.out.println("8. h = x/2 + 2x/4 + 3x/6");
            System.out.println("9. y = 5x - 3/x + 6 + 7x - 12"+System.lineSeparator());
            System.out.println("Выберите номер уравнения, которое будем считать - от 1 до 9 ");
            z1 = scanner.nextShort();
            if (z1<1) {
                System.out.println("упс - что то пошло не так :-((((");
            }
            if (z1>9) {
                System.out.println("упс - что то пошло не так :-((((");
            }
            if (z1 == 1) {
                Task_A();
            }
            if (z1 == 2) {
                Task_B();
            }
            if (z1 == 3) {
                Task_C();
            }
            if (z1 == 4) {
                Task_D();
            }
            if (z1 == 5) {
                Task_E();
            }
            if (z1 == 6) {
                Task_F();
            }
            if (z1 == 7) {
            Task_G();
            }
            if (z1 == 8) {
            Task_H();
            }
            if (z1 == 9) {
            Task_Y();
            }
        /**
         * Здесь не получилось вывести результат любой функции - чтоб передать его в дальнейшие расчеты
         * поэтому просто смайлик
         */
            System.out.println(";-)");
    }

    private static void Task_H() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А теперь укажите значение x");
        double h=0;
        double x=0;
        x = scanner.nextFloat();
        h = x/2 + 2*x/4 + 3*x/6;
        System.out.println("h = x/2 + 2*x/4 + 3*x/6 = "+h);
    }

    private static void Task_Y() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А теперь укажите значение x");
        double y=0, x=0;
        x = scanner.nextFloat();
        y = 5 * x - 3 / x + 6 + 7*x - 12;
        /**
         * Здесь интересный результат при округлении и без при x=0)))
         */
        System.out.println("y = 5*x - 3/x + 6 + 7*x - 12 = "+Math.round(y*100.0)/100.0);
        System.out.println("y = 5*x - 3/x + 6 + 7*x - 12 = "+y);
    }

    private static void Task_G() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А теперь укажите значение x");
        double g=0, x=0;
        x = scanner.nextFloat();
        g = 2.5*(4 - 6*x) -5;
        System.out.println("g = 2.5*(4 - 6*x) -5 = "+g);
    }

    private static void Task_F() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А теперь укажите значение x");
        double f=0, x=0;
        x = scanner.nextFloat();
        f = 3 + 9*x - 5/x - 1;
        System.out.println("f = 3 + 9*x - 5/x - 1 = "+f);
    }

    private static void Task_E() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А теперь укажите значение x");
        double e=0, x=0;
        x = scanner.nextFloat();
        e = (x + 4)*(485 - 179);
        System.out.println("e = (x + 4)*(485 - 179) = "+e);
    }

    private static void Task_D() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("А теперь укажите значение x");
        double d=0, x=0;
        x = scanner.nextFloat();
        d = (x - 2)*122;
        System.out.println("d = (x - 2)*122 = "+d);
        System.out.println("если округлить до 2х знаков d = (x - 2)*122 = "+Math.round(d*100.0)/100.0);
    }
    private static void Task_C() {
        Scanner scanner = new Scanner(System.in);
        double x=0, c=0;
        System.out.println("А теперь укажите значение x");
        x = scanner.nextFloat();
        c = x*(-3 + 2) + 1;
        System.out.println("c = x*(-3 + 2) + 1 = "+c);
    }

    private static void Task_B() {
        Scanner scanner = new Scanner(System.in);
        double b=0, x=0;
        System.out.println("А теперь укажите значение x");
        x = scanner.nextFloat();
        b = 4*x*3 - 12;
        System.out.println("b = 4*x*3 - 12 = "+b);
    }

    private static void Task_A() {
        Scanner scanner = new Scanner(System.in);
        double a=0,x=0;
        System.out.println("А теперь укажите значение x");
        x = scanner.nextFloat();
        a =  3*x + 2 - 7;
        System.out.println("a = 3х + 2 -7="+Math.round(a*100.00)/100);
    }
}
