package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int),
отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.security.SecureRandom;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human grPaF = new Human();
        Human grMaF = new Human();
        Human grPaM = new Human();
        Human grMaM = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human son1 = new Human();
        Human son2 = new Human();
        Human daughter = new Human();

        daughter.setName("Daugh");
        daughter.setAge(10);
        daughter.setSex(false);
        daughter.setFather(father);
        daughter.setMother(mother);

        son1.setName("Son1");
        son1.setAge(13);
        son1.setSex(true);
        son1.setFather(father);
        son1.setMother(mother);

        son2.setName("SOn2");
        son2.setAge(4);
        son2.setSex(true);
        son2.setFather(father);
        son2.setMother(mother);

        father.setName("Fath");
        father.setAge(32);
        father.setSex(true);
        father.setFather(grPaF);
        father.setMother(grMaF);

        mother.setName("Moth");
        mother.setAge(29);
        mother.setSex(false);
        mother.setFather(grPaM);
        mother.setMother(grMaM);

        grPaF.setName("GrpaF");
        grPaF.setAge(77);
        grPaF.setSex(true);

        grPaM.setName("GrpaM");
        grPaM.setAge(73);
        grPaM.setSex(true);

        grMaF.setName("GrMaF");
        grMaF.setAge(67);
        grMaF.setSex(false);

        grMaM.setName("GrMaM");
        grMaM.setAge(80);
        grMaM.setSex(false);

        System.out.println(grMaF);
        System.out.println(grMaM);
        System.out.println(grPaF);
        System.out.println(grPaM);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public boolean isSex()
        {
            return sex;
        }

        public void setSex(boolean sex)
        {
            this.sex = sex;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        public Human getFather()
        {
            return father;
        }

        public void setFather(Human father)
        {
            this.father = father;
        }

        public Human getMother()
        {
            return mother;
        }

        public void setMother(Human mother)
        {
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
