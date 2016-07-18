package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();

        int min=0, max=0, mid=0;

        if (a>b&& a>c) max=a;
        else if (b>c&& b>a) max=b;
        else max=c;

        if (a<b && a<c) min=a;
        else if (b<a&&b<c) min=b;
        else min=c;

        if (max!=c&&min!=c) mid=c;
        else if (max!=b&&min!=b) mid=b;
        else mid=a;


        System.out.println(max+" "+mid+" "+min);
    }
}
