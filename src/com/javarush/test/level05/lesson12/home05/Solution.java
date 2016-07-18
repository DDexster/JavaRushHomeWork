package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;

        for (int i = 0; true; i++)
        {
            String si=br.readLine();
            if (si.equals("сумма")) break;
            else {
                int n=Integer.parseInt(si);
                sum+=n;
            }
        }

        System.out.println(sum);
    }
}
