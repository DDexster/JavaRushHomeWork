package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int N=Integer.parseInt(reader.readLine());

        int maximum=0;
        if (N>0) {
            int i=0;
            while (i<N) {
                a = Integer.parseInt(reader.readLine());
                if (maximum==0) maximum=a;
                maximum = (a > maximum ? a : maximum);
                i++;
            }
        }

        System.out.println(maximum);
    }
}
