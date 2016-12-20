package com.javarush.test.level03.lesson03.task02;

import java.util.Scanner;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        int eur= 100;
        double course=1.33;
        System.out.println(eur+" евро по курсу "+course+" будет: "+convertEurToUsd(eur,course));
        int eur1= 50;
        double course1=1.01;
        System.out.println(eur+" евро по курсу "+course+" будет: "+convertEurToUsd(eur1,course1));
    }

    public static double convertEurToUsd(int eur, double course){

        return eur*course;
            }
}
