package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

public class Solution
{
    public Solution(Object a)
    {
    }

    public Solution(String a)
    {
    }

    public Solution(Number a)
    {
    }

    Solution(Integer a)
    {
    }

    Solution(Double a)
    {
    }

    Solution(Float a)
    {
    }

    protected Solution(Exception a)
    {
    }

    protected Solution(Thread a)
    {
    }

    protected Solution(Enumeration a)
    {
    }

    private Solution(Collection a)
    {
    }

    private Solution(List a)
    {
    }

    private Solution(Set a)
    {
    }
}

