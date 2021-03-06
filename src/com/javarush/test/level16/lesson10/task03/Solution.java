package com.javarush.test.level16.lesson10.task03;

/* Снова interrupt
Создай нить TestThread.
В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        //Add your code here - добавь код тут
        TestThread test = new TestThread();
        test.start();
        Thread.sleep(1000);
        test.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread
    {
        public TestThread()
        {
            super();
        }

        @Override
        public void run()
        {
            int i = 0;
            while (!this.isInterrupted())
            {
                System.out.println(i);
                i++;
            }
        }
    }
}
