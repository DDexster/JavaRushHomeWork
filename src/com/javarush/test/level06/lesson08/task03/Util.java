package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        double n = x2 - x1;
        double n1 = y2 - y1;
        double a = Math.pow(n, 2.0) + Math.pow(n1, 2.0);
        return Math.sqrt(a);
    }
}
