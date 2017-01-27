package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution
{
    public static final String MALE_STR = "м";
    public static final String FEMALE_STR = "ж";
    public static List<Person> allPeople = new ArrayList<Person>();

    static
    {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args)
    {
        if (args.length != 0)
        {
            String command = args[0];
            String params = "";
            for (int i = 1; i < args.length; i++)
            {
                params += args[i] + " ";
            }

            String[] tokens = params.split(" ");

            try
            {
                switch (command)
                {
                    case "-c":
                        doCreate(tokens);
                        break;
                    case "-u":
                        doUpdate(tokens);
                        break;
                    case "-d":
                        doDelete(tokens);
                        break;
                    case "-i":
                        doInfo(tokens);
                        break;
                    default:
                        break;
                }
            }
            catch (ParseException e)
            {
            }
        }
    }


    private static void doInfo(String[] tokens)
    {
        int id = Integer.parseInt(tokens[0]);
        if (id < allPeople.size())
        {
            Person person = allPeople.get(id);
            printPerson(person);
        }
    }

    private static void doDelete(String[] tokens)
    {
        int id = Integer.parseInt(tokens[0]);
        if (id < allPeople.size())
        {
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }

    }

    private static void doUpdate(String[] tokens) throws ParseException
    {
        int id = Integer.parseInt(tokens[0]);
        String[] params = new String[tokens.length - 1];
        System.arraycopy(tokens, 1, params, 0, tokens.length - 1);
        Person updatedPerson = getPerson(params);
        if (updatedPerson != null && id < allPeople.size())
        {
            allPeople.set(id, updatedPerson);
        }
    }

    private static void doCreate(String[] tokens) throws ParseException
    {
        Person createdPerson = getPerson(tokens);
        if (createdPerson != null)
        {
            allPeople.add(createdPerson);
            System.out.println(allPeople.indexOf(createdPerson));
        }

    }

    private static Person getPerson(String[] tokens) throws ParseException
    {
        int count = 0;
        String name = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        for (String token : tokens)
        {
            if (!token.equals(MALE_STR) && !token.equals(FEMALE_STR))
            {
                name += token + " ";
                count++;
            } else break;
        }

        if (count < tokens.length)
        {
            name = name.substring(0, name.length() - 1);
            String sex = tokens[count];
            Date bd = sdf.parse(tokens[count + 1]);
            if (sex.equals(MALE_STR))
            {
                return Person.createMale(name, bd);
            } else if (sex.equals(FEMALE_STR))
            {
                return Person.createFemale(name, bd);
            } else return null;
        }
        return null;
    }

    private static void printPerson(Person person)
    {
        String result;
        result = person.getName() + " "
                + getSexString(person) + " "
                + getDateString(person);
        System.out.println(result);
    }

    private static String getDateString(Person person)
    {
        if (person.getBirthDay() != null)
        {
            return new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDay());
        } else return null;

    }

    private static String getSexString(Person person)
    {
        if (person.getSex() != null)
        {
            return (person.getSex() == Sex.MALE) ? MALE_STR : FEMALE_STR;
        } else return null;
    }
}
