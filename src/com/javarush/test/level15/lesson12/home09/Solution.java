package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
/index.html?lvl=15&view&name=Amigo&obj=20&obj=Test
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String url = br.readLine();

            String parameterSet = url.substring(url.indexOf("?") + 1);
            String[] pairs = parameterSet.split("&");
            List<String> params = new ArrayList<>();
            List<String> values = new ArrayList<>();

            for (String pair : pairs)
            {
                String[] tokenParam = pair.split("=");
                String param = tokenParam[0];
                String value = null;
                if (tokenParam.length > 1)
                {
                    value = tokenParam[1];
                }
                params.add(param);
                values.add(value);

            }

            printParams(params);
            if (params.contains("obj"))
            {
                printAlert(params, values);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void printAlert(List<String> params, List<String> values)
    {
        for (int i = 0; i < params.size(); i++)
        {
            if (params.get(i).equals("obj"))
            {
                String value = values.get(i);
                try
                {
                    Double d = Double.parseDouble(value);
                    alert(d);
                }
                catch (Exception e)
                {
                    alert(value);
                }
            }
        }
    }

    private static void printParams(List<String> params)
    {
        for (String param : params)
        {
            System.out.print(param + " ");
        }
        System.out.println();
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }
}
