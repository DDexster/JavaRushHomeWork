package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++)
        {
            String s = br.readLine();
            a[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < a.length / 2; i++)
        {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);

        }
    }
}
