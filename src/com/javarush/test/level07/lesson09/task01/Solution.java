package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран.
Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 20; i++)
        {
            String s = br.readLine();
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); )
        {
            int x = list.get(i);
            if (x % 3 == 0) div3.add(list.get(i));
            if (x % 2 == 0) div2.add(list.get(i));
            else if (x % 3 != 0 && x % 2 != 0) ints.add(list.get(i));
            i++;

        }

        printList(div3);
        System.out.println();
        printList(div2);
        System.out.println();
        printList(ints);
    }


    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
