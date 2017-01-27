package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution
{
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static
    {
        threads.add(new NumOne());
        threads.add(new NumTwo());
        threads.add(new NumThree());
        threads.add(new NumFour());
        threads.add(new NumFive());
    }

    public static class NumOne extends Thread
    {
        @Override
        public void run()
        {
            while (!isInterrupted())
            {

            }
        }
    }

    public static class NumTwo extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while (!isInterrupted())
                {
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException");
            }

        }
    }

    public static class NumThree extends Thread
    {
        @Override
        public void run()
        {
            while (!this.isInterrupted())
            {
                System.out.println("Ура");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                }
            }
        }
    }

    public static class NumFour extends Thread implements Message
    {
        @Override
        public void run()
        {
            while (!this.isInterrupted())
            {

            }
        }

        @Override
        public void showWarning()
        {
            if (this.isAlive())
            {
                this.interrupt();
                try
                {
                    this.join();
                }
                catch (InterruptedException e)
                {
                }
            }
        }
    }

    public static class NumFive extends Thread
    {

        @Override
        public void run()
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try
            {

                String line = br.readLine();

                int result = 0;
                while (!line.equals("N"))
                {
                    result += Integer.parseInt(line);
                    line = br.readLine();
                }
                System.out.println(result);

            }
            catch (IOException e)
            {
            }
            finally
            {
                try
                {
                    br.close();
                }
                catch (IOException e)
                {
                }
            }
        }
    }

    public static void main(String[] args)
    {
        for (Thread thread : threads)
        {
            thread.start();
        }
    }
}

