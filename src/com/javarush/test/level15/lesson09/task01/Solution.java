package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution
{
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(1.0, "Way");
        labels.put(2.0, "To");
        labels.put(3.0, "Go");
        labels.put(4.0, "My");
        labels.put(5.0, "Friend");

    }

    public static void main(String[] args)
    {
        System.out.println(labels);
    }
}
