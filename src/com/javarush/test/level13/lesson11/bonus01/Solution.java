package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while ((line = reader.readLine()) != null)
        {
            arrayList.add(Integer.parseInt(line));
        }
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();

        for (Integer integer : arrayList)
        {
            if (integer % 2 == 0) evens.add(integer);
        }

        Collections.sort(evens);

        for (Integer even : evens)
        {
            System.out.println(even);
        }


    }
}
