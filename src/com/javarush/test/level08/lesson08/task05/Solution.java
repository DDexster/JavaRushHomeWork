package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> cpy = new HashMap<>(map);
        for (String value : cpy.values())
        {
            if (Collections.frequency(cpy.values(), value) > 1)
                removeItemFromMapByValue(map, value);
        }
// for (String s : map.values())
//        {
//            int count=0;
//            for (String s1 : map.values())
//            {
//                if(s1.equals(s)) count++;
//            }
//            if (count>1) removeItemFromMapByValue(map, s);
//        }

    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String s1 = pair.getKey();
            String s2 = pair.getValue();
            System.out.println(s1 + " - " + s2);
        }
    }
}
