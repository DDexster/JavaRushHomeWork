package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = new String[10];

        for (int i = 0; i < 8; i++)
        {
            String s = br.readLine();
            lines[i] = s.toString();
        }

        for (int i = 10; i > 0; i--)
        {
            System.out.println(lines[i - 1]);
        }
    }
}