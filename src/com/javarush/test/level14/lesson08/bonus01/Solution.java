package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Integer integer = new Integer("12g");

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] array = {3, 5, 7};
            int s = array[6];

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            List<Object> list = null;
            for (Object o : list)
            {
                o.getClass();
            }

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            BufferedReader filename = new BufferedReader(new FileReader("filename"));
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new ClassCastException();
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new IllegalArgumentException();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new IOException();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new InterruptedIOException();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new SecurityException();

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here

    }
}
