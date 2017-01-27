package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human human1 = new Human();
        Human human2 = new Human("Dex", "Bond", 31, true, 184, 98);
        Human human3 = new Human("John", 25, true);
        Human human4 = new Human("Sam", "Smith", true);
        Human human5 = new Human("Nick", "Tempelton", 196, 77);
        Human human6 = new Human("Tim", "Carter");
        Human human7 = new Human("Tim");
        Human human8 = new Human("Tim", true, 177, 76);
        Human human9 = new Human("Tim", 177, 76);
        Human human10 = new Human("Tim", 76);


    }

    public static class Human
    {
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private double height;
        private int weight;

        public Human()
        {
        }

        public Human(String name, String surname, int age, boolean sex, double height, int weight)
        {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, boolean sex)
        {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(String name, String surname, double height, int weight)
        {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, double height, int weight)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, boolean sex, double height, int weight)
        {
            this.name = name;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, double height, int weight)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, double height)
        {
            this.name = name;
            this.height = height;
        }
    }
}
