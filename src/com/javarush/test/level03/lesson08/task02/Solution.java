package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String name=sc.readLine();
        String snum1=sc.readLine();
        String snum2=sc.readLine();
        int num1=Integer.parseInt(snum1);
        int num2=Integer.parseInt(snum2);
        System.out.println(name+" получает "+ num1+" через "+ num2+" лет.");
    }
}