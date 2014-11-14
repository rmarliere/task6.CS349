package task6.money;

/**
 * com.money
 * Author: RodrigoMarliere
 * Revision date: 11/13/14
 * Assignment:
 * Class:
 */

public class A_Currency implements Comparable<A_Currency>
{
    private final Money _money;
    private final String _description;
    public A_Currency(Money money, java.lang.String description)
    {
        _money = money;
        _description = description;
    }

    public Money add(A_Currency amount)
    {
        Money money1 = amount.getValue();
        Money money2 = getValue();

        return money1.add(money2);
    }

    public Money add(Money amount)
    {
        return getValue().add(amount);
    }

    public java.lang.String getDescription()
    {
        return _description;
    }

    public Money getValue()
    {
        return _money;
    }

    public Money subtract(A_Currency amount)
    {
        Money money1 = getValue();
        Money money2 = amount.getValue();

        return money1.subtract(money2);
    }

    public Money subtract(Money amount)
    {
        return getValue().subtract(amount);
    }

    @Override
    public int compareTo(A_Currency money)
    {
        Money money1 = getValue();
        Money money2 = money.getValue();
        return money1.compareTo(money2);
    }
}
