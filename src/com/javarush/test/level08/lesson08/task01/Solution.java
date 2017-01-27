package com.javarush.test.level08.lesson08.task01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> strings = new HashSet<>();
        Collections.addAll(strings, "липа", "лапа", "лада", "лола", "лила", "лилу", "лата", "латы", "лопата", "лимон",
                "лимонка", "литавры", "лампадка", "лабуда", "лампасы", "лета", "летчик", "лазутчик", "лигп", "лягушка");
        return strings;
    }
}
