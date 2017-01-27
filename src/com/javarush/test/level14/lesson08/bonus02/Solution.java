package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(br.readLine());
        Integer b = Integer.parseInt(br.readLine());
        System.out.println(getNODe(a, b));
    }

    private static int getNODe(Integer a, Integer b)
    {
        List<Integer> aList = getDividers(a);
        List<Integer> bList = getDividers(b);

        List<Integer> result = new ArrayList<>();

        if (a < b)
        {
            for (int i = 0; i < aList.size(); i++)
            {
                for (int j = 0; j < bList.size(); j++)
                {
                    if (aList.get(i) == bList.get(j)) result.add(aList.get(i));
                }
            }

        } else
        {
            for (int i = 0; i < bList.size(); i++)
            {
                for (int j = 0; j < aList.size(); j++)
                {
                    if (bList.get(i) == aList.get(j)) result.add(bList.get(i));
                }
            }
        }

        return result.get(result.size() - 1);
    }

    private static List<Integer> getDividers(Integer a)
    {
        List<Integer> dividers = new ArrayList<>();
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0) dividers.add(i);
        }
        return dividers;
    }
}
