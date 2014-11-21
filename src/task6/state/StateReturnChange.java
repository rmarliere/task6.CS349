package task6.state;

import task6.Transaction;
import task6.ingredient.A_Ingredient;
import task6.money.A_Currency;
import task6.money.CurrencyManager;
import task6.money.Money;

import java.util.List;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateReturnChange extends A_State
{
    public StateReturnChange(Transaction transaction)
    {
        super(transaction);
        String output = "[MACHINE] returned\n";
        List<A_Currency> change = makeChange();
        for (A_Currency currency: change)
        {
            output = output + "-> " + currency.getDescription() + "\n";
        }
        System.out.println(output);
    }

    @Override
    public StateStartTransaction doStartTransaction()
    {
        return new StateStartTransaction();
    }

    public List<A_Currency> makeChange()
    {
        Money tendered = getTransaction().getMoneyTendered();
        Money total    = getTransaction().getProductCost();

        if (total.compareTo(tendered) == 1)
        {
            throw new RuntimeException("insufficient funds were tendered for the cost encumbered");
        }

        Money change = tendered.subtract(total);
        CurrencyManager manager = new CurrencyManager();
        return manager.makeChange(change);
    }
}
