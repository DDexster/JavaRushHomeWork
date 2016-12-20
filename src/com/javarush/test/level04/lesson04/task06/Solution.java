package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда»,
«четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String [] week={"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        String sn=sc.readLine();
        int a=Integer.parseInt(sn);

        if (a>0&&a<8)
            System.out.println(week[a-1]);
        else
            System.out.println("такого дня недели не существует");

    }

}