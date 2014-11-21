package task6.state;

import task6.Transaction;
import task6.money.A_Currency;
import task6.money.CurrencyManager;

import java.util.List;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateReturnRefund extends A_State
{
    public StateReturnRefund(Transaction transaction)
    {
        super(transaction);
        String output = "[MACHINE] refunded\n";
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

    public java.util.List<A_Currency> makeChange()
    {
        CurrencyManager manager = new CurrencyManager();
        return manager.makeChange(getTransaction().getMoneyTendered());
    }
}
