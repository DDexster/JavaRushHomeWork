package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика - куст, жень-шень - корень,
земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> col = new HashMap<String, String>();
        col.put("арбуз", "ягода");
        col.put("банан", "трава");
        col.put("вишня", "ягода");
        col.put("груша", "фрукт");
        col.put("дыня", "овощ");
        col.put("ежевика", "куст");
        col.put("жень-шень", "корень");
        col.put("земляника", "ягода");
        col.put("ирис", "цветок");
        col.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : col.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
