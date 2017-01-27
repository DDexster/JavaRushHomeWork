package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года -
нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        Date date1 = new Date(date);
        Date dateNY = new Date(date1.getYear(), 0, 1);
        long msTimeDist = date1.getTime() - dateNY.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int days = (int) (msTimeDist / msDay);

        if (days % 2 != 0) return false;

        return true;
    }
}
