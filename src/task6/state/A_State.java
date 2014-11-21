package task6.state;

import task6.Transaction;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public abstract class A_State
{
    private Transaction _transaction;
    public A_State(Transaction transaction)
    {
        _transaction = transaction;
    }

    public StateDeliverProduct doDeliverProduct()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateReturnChange doReturnChange()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateReturnRefund doReturnRefund()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateBuildCoffeeBaseDecaf doSelectCoffeeBaseDecaf()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateBuildCoffeeBaseRegular doSelectCoffeeBaseRegular()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateBuildCoffeeExtraCream doSelectExtraCream()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateBuildCoffeeExtraMilk doSelectExtraMilk()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateBuildCoffeeExtraSugar doSelectExtraSugar()
    {
        throw new RuntimeException("Illegal transition");
    }

    public StateStartTransaction doStartTransaction()
    {
        throw new RuntimeException("Illegal transition");
    }

    public Transaction getTransaction()
    {
        return _transaction;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName()+"{transaction=" + getTransaction().toString() + "}";
    }
}
