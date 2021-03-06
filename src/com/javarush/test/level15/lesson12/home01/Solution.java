package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while (true)
        {
            line = br.readLine();
            Integer i = null;
            boolean isNum;
            if ("exit".equals(line)) return;

            if (line.contains(".")) print(Double.parseDouble(line));
            else
            {
                try
                {
                    i = Integer.parseInt(line);
                    isNum = true;
                }
                catch (Exception e)
                {
                    isNum = false;
                }

                if (isNum)
                {
                    int a = i;
                    if (a > 0 && a < 128) print((short) a);
                    else if (a >= 128) print(a);
                } else
                {
                    print(line);
                }
            }
        }
    }

    public static void print(Double value)
    {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value)
    {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value)
    {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value)
    {
        System.out.println("Это тип Integer, значение " + value);
    }
}
