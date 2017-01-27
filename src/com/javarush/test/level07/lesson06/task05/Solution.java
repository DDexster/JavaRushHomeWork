package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            String s = br.readLine();
            list.add(s);
        }

        int i = 0;
        while (i < 13)
        {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            i++;
        }

        for (int j = 0; j < list.size(); j++)
        {
            System.out.println(list.get(j));
        }
    }
}
