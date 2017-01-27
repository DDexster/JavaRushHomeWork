package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;


/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Bondarekro", "Dmytro");
        map.put("Bondarekro1", "Kse");
        map.put("Bondarekro2", "Gal");
        map.put("Bondarekro3", "Pablo");
        map.put("Bondarekro4", "Nick");
        map.put("Bondarekro5", "Nick");
        map.put("Bondarekro6", "Dmytro");
        map.put("Bondarekro7", "Gal");
        map.put("Bondarekro8", "Gal");
        map.put("Bondarekro9", "Gal");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for (String s : map.values())
        {

            if (s.equals(name)) i++;
        }
        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i = 0;
        for (String s : map.keySet())
        {
            if (s.equals(lastName)) i++;
        }
        return i;
    }
}
