package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int [] a=new int[3];
        for (int i = 0; i < a.length; i++)
        {
            a[i]=sc.nextInt();
        }

        int count=0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i]>0) count+=1;
        }
        System.out.println(count);
    }
}
