package task6.money;

/**
 * task6.money
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/13/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class Money implements Comparable<Money>
{
    private int _dollars;
    private int _cents;
    private boolean _isPositive = true;

    public Money()
    {

    }

    public Money(int cents)
    {
        _cents = cents;
        setIsPositive();
    }

    public Money(int dollars, int cents)
    {
        _dollars = dollars;
        _cents = cents;
        setIsPositive();
    }

    public Money(int dollars, int cents, boolean isPositive)
    {
        _dollars = dollars;
        _cents = cents;
        _isPositive = isPositive;
    }

    public Money add(Money money)
    {
        int cents = money.getCentsOfDollar() + _cents;
        int dollars = money.getDollars() + _dollars;
        setIsPositive();

        return new Money(dollars, cents);
    }

    @Override
    public boolean equals(Object object)
    {
        if (hashCode() == object.hashCode())
        {
            return true;
        }
        return false;
    }

    public int getCentsOfDollar()
    {
        return _cents;
    }

    public int getCentsTotal()
    {
        return (getDollars() * 100) + _cents;
    }

    public int getDollars()
    {
        return _dollars;
    }

    @Override
    public int hashCode()
    {
        int hash = 37;
        hash = hash * 23 + getCentsOfDollar();
        hash = hash * 23 + getCentsTotal();
        hash = hash * 23 + getDollars();
        int isPositive = (isPositive()) ? 1 : 0;
        hash = hash * 23 + isPositive;
        return hash;
    }

    public boolean isNegative()
    {
        return !isPositive();
    }

    private void setIsPositive()
    {
        _isPositive = isPositive();
    }

    public boolean isPositive()
    {
        if (getCentsTotal() > 0)
        {
            return true;
        }
        return false;
    }

    public boolean isZero()
    {
        if (_dollars == 0 && _cents == 0)
        {
            return true;
        }
        return false;
    }

    public Money subtract(Money money)
    {
        int cents = _cents - money.getCentsOfDollar();
        int dollars = _dollars - money.getDollars();
        setIsPositive();

        return new Money(dollars, cents);
    }

    @Override
    public String toString()
    {
        double amount = (double) getCentsTotal()/100;
        if (isPositive())
        {
            return "$" + String.format("%.2f", amount);
        }
        else
        {
            return "-$" + String.format("%.2f", amount*-1);
        }
    }

    @Override
    public int compareTo(Money money)
    {
        if (getCentsTotal() > money.getCentsTotal())
        {
            return 1;
        }
        else if (getCentsTotal() < money.getCentsTotal())
        {
            return -1;
        }
        return 0;
    }
}
