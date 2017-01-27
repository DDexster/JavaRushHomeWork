package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.lang.Integer;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            integers.add(i);
        }
        return integers;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            Integer num = iterator.next();
            if (num > 10) iterator.remove();
        }
        return set;
    }

}
