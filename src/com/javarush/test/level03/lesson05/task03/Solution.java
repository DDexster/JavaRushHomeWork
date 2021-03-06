package com.javarush.test.level03.lesson05.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Solution
{

    public static int convertToSeconds (int hour) {
        return hour*3600;
    }

    public static void main(String[] args) {
        int h1=15, h2=3;
        System.out.println(h1+" hours, consists of "+convertToSeconds(h1)+" seconds");
        System.out.println(h2+" hours, consists of "+convertToSeconds(h2)+" seconds");
    }
}