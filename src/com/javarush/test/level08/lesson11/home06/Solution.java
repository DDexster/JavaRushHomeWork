package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

        ArrayList<Human> kids = new ArrayList<>();
        kids.add(new Human("John", true, 10));
        kids.add(new Human("Stan", true, 8));
        kids.add(new Human("Cartman", true, 5));

        ArrayList<Human> parents = new ArrayList<>();
        parents.add(new Human("Tim", true, 32, kids));
        parents.add(new Human("Carla", false, 29, kids));

        ArrayList<Human> grpa = new ArrayList<>();
        grpa.add(new Human("Peiley", true, 67, parents));
        grpa.add(new Human("Stella", false, 65, parents));
        grpa.add(new Human("Mick", true, 89, parents));
        grpa.add(new Human("Diamond", false, 76, parents));

        for (Human human : grpa)
        {
            System.out.println(human.toString());
        }
        for (Human parent : parents)
        {
            System.out.println(parent.toString());
        }
        for (Human kid : kids)
        {
            System.out.println(kid.toString());
        }
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
