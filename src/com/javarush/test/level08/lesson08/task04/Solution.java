package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Bondarenko", new Date("AUGUST 10 1985"));
        map.put("Franko", new Date("JANUARY 5 1955"));
        map.put("Illushin", new Date("MAY 8 1895"));
        map.put("Yakovlev", new Date("SEPTEMBER 8 1915"));
        map.put("Moroka", new Date("FEBRUARY 2 1988"));
        map.put("Chuzha", new Date("OCTOBER 4 1985"));
        map.put("Kovalenko", new Date("OCTOBER 2 1985"));
        map.put("Polischuk", new Date("FEBRUARY 25 1985"));
        map.put("Prilepsky", new Date("NOVEMBER 1 1977"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String> list = new ArrayList<>();

        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Date> pair = it.next();
            Date d = pair.getValue();
            if (d.getMonth() == 5 || d.getMonth() == 6 || d.getMonth() == 7) list.add(pair.getKey());
        }

        for (int i = 0; i < list.size(); i++)
        {
            map.remove(list.get(i));
        }

    }

//    public static ArrayList<String> removeAllSummerP(HashMap<String, Date> map)
//    {
//        ArrayList<String> list = new ArrayList<>();
//
//        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
//        while (it.hasNext())
//        {
//            Map.Entry<String, Date> pair = it.next();
//            Date d = pair.getValue();
//            if (d.getMonth() == 5 || d.getMonth() == 6 || d.getMonth() == 7) list.add(pair.getKey());
//        }
//
//        for (int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }
//
//        return list;
//    }
//
//    public static void main(String[] args)
//    {
//       HashMap<String,Date> d= createMap();
//        removeAllSummerP(d);
//    }
}

