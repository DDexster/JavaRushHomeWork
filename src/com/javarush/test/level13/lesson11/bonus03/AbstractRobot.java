package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot
{
    private static int hitCount;

    public abstract String getName();

    public BodyPart attack()
    {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;

        attackedBodyPart = getBodyPart(attackedBodyPart);

        return attackedBodyPart;
    }

    public BodyPart defense()
    {
        BodyPart defencedBodyPart = null;
        hitCount = hitCount + 1;

        defencedBodyPart = getBodyPart(defencedBodyPart);

        return defencedBodyPart;
    }

    private BodyPart getBodyPart(BodyPart attackedBodyPart)
    {
        if (hitCount == 1)
        {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2)
        {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3)
        {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4)
        {
            hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }
}
