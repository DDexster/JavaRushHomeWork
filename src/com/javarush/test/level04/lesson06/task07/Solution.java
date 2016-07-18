package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int [] ar= new int[3];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i]= sc.nextInt();
        }

        if (ar[0] != ar[1] && ar[0] != ar[2]) System.out.println("1");
        else if (ar[1]!=ar[2] && ar[1]!=ar[0]) System.out.println("2");
        else System.out.println("3");

    }
}
