package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Beach implements Comparable<Beach>
{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality)
    {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public String getName()
    {
        return name;
    }

    public synchronized void setName(String name)
    {
        this.name = name;
    }

    public float getDistance()
    {
        return distance;
    }

    public synchronized void setDistance(float distance)
    {
        this.distance = distance;
    }

    public int getQuality()
    {
        return quality;
    }

    public synchronized void setQuality(int quality)
    {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o)
    {
        if (this.distance == o.getDistance())
        {
            if (this.quality == o.getQuality()) return 0;
            else return this.quality < o.getQuality() ? 1 : -1;
        } else
        {
            return this.distance > o.getDistance() ? 1 : -1;
        }
    }

//    @Override
//    public synchronized int compareTo(Beach o)
//    {
//            if (this.quality == o.getQuality())
//            {
//                if (this.distance==o.getDistance()) return 0;
//                else return this.distance<o.getDistance()?-1:1;
//            } else
//            {
//                return this.quality>o.getQuality()?-1:1;
//            }
//    }

//    @Override
//    public String toString()
//    {
//        final StringBuilder sb = new StringBuilder("Beach{");
//        sb.append("name='").append(name).append('\'');
//        sb.append(", distance=").append(distance);
//        sb.append(", quality=").append(quality);
//        sb.append('}');
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        ArrayList<Beach> beaches = new ArrayList<Beach>();
//        beaches.add(new Beach("b1", 15, 5));
//        beaches.add(new Beach("b2", 12, 2));
//        beaches.add(new Beach("b3", 11, 4));
//        beaches.add(new Beach("b4", 40, 5));
//        beaches.add(new Beach("b5",  5, 1));
//        beaches.add(new Beach("b6", 40, 1));
//        beaches.add(new Beach("b7", 75, 5));
//        beaches.add(new Beach("b8", 24, 3));
//        beaches.add(new Beach("b9", 20, 2));
//        beaches.add(new Beach("b10",30, 4));
//        for (Beach beach : beaches)
//        {
//            System.out.println(beach);
//        }
//        Collections.sort(beaches);
//        System.out.println();
//        for (Beach beach : beaches)
//        {
//            System.out.println(beach);
//        }
//    }
}