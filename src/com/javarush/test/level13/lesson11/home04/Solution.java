package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter filename:");
        String filename = br.readLine();
        PrintWriter writer = new PrintWriter(new FileWriter(filename));

        String string = null;
        while (true)
        {
            string = br.readLine();
            writer.println(string);
            if (string.equals("exit")) break;
        }

        br.close();
        writer.close();

    }
}
