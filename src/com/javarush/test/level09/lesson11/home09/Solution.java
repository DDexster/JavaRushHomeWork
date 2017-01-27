package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> catmap = new HashMap<>();
        catmap.put("Murz", new Cat("Murz"));
        catmap.put("Vas", new Cat("Vas"));
        catmap.put("Zim", new Cat("Zim"));
        catmap.put("Carl", new Cat("Carl"));
        catmap.put("Ted", new Cat("Ted"));
        catmap.put("Max", new Cat("Max"));
        catmap.put("Red", new Cat("Red"));
        catmap.put("Vince", new Cat("Vince"));
        catmap.put("Leo", new Cat("Leo"));
        catmap.put("Mark", new Cat("Mark"));
        return catmap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> catset = new HashSet<>();
        for (Cat cat : map.values())
        {
            catset.add(cat);
        }
        return catset;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat : set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }


}
