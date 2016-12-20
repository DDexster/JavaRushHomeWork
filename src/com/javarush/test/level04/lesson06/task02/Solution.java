package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt();
        int c1=0, c2=0;

        if (a>b) c1=a;
        else c1=b;

        if (c>d) c2=c;
        else c2=d;

        if (c1>c2) System.out.println(c1);
        else System.out.println(c2);

    }
}
