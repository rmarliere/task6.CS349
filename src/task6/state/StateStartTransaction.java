package task6.state;

import task6.Transaction;
import task6.ingredient.IngredientBaseCoffeeDecaf;
import task6.ingredient.IngredientBaseCoffeeRegular;
import task6.money.A_Currency;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateStartTransaction extends A_State
{
    public StateStartTransaction()
    {
        super(new Transaction());
    }

    @Override
    public StateReturnRefund doReturnRefund()
    {
        return new StateReturnRefund(getTransaction());
    }

    @Override
    public StateBuildCoffeeBaseDecaf doSelectCoffeeBaseDecaf()
    {
        return new StateBuildCoffeeBaseDecaf(getTransaction());
    }

    @Override
    public StateBuildCoffeeBaseRegular doSelectCoffeeBaseRegular()
    {
        return new StateBuildCoffeeBaseRegular(getTransaction());
    }

    public void insertMoney(A_Currency denomination)
    {
        getTransaction().addMoneyTendered(denomination);
    }
}
