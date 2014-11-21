package task6.state;

import task6.Transaction;
import task6.ingredient.IngredientBaseCoffeeRegular;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public abstract class A_StateBuildCoffeeExtra extends A_State
{
    public A_StateBuildCoffeeExtra(Transaction transaction)
    {
        super(transaction);
    }

    @Override
    public StateDeliverProduct doDeliverProduct()
    {
        return new StateDeliverProduct(getTransaction());
    }

    @Override
    public StateReturnRefund doReturnRefund()
    {
        return new StateReturnRefund(getTransaction());
    }

    @Override
    public StateBuildCoffeeExtraCream doSelectExtraCream()
    {
        return new StateBuildCoffeeExtraCream(getTransaction());
    }

    @Override
    public StateBuildCoffeeExtraMilk doSelectExtraMilk()
    {
        return new StateBuildCoffeeExtraMilk(getTransaction());
    }

    @Override
    public StateBuildCoffeeExtraSugar doSelectExtraSugar()
    {
        return new StateBuildCoffeeExtraSugar(getTransaction());
    }
}
