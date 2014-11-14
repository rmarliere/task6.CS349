package task6.money;

import java.util.ArrayList;
import java.util.List;

/**
 * task6.money
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/13/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class CurrencyManager
{
    private int _profit;

    public CurrencyManager()
    {

    }

    public Money getExchangeProfit()
    {
        return new Money(_profit);
    }

    public java.util.List<A_Currency> makeChange(Money amount)
    {
        List<A_Currency> change = new ArrayList<A_Currency>();
        int cents = amount.getCentsTotal();
        int dollar = cents / 100;
        if (dollar > 0) {
            cents = cents % 100;
            for (int i = 0; i < dollar; i++)
            {
                CurrencyCoinDollar_1 coin = new CurrencyCoinDollar_1();
                change.add(coin);
            }
        }
        int quarters = cents / 25;
        if (quarters > 0) {
            cents = cents % 25;
            for (int i = 0; i < quarters; i++)
            {
                CurrencyCoinCent_25 coin = new CurrencyCoinCent_25();
                change.add(coin);
            }
        }
        int dimes = cents / 10;
        if (dimes > 0) {
            cents = cents % 10;
            for (int i = 0; i < dimes; i++)
            {
                CurrencyCoinCent_10 coin = new CurrencyCoinCent_10();
                change.add(coin);
            }
        }
        int nickels = cents / 5;
        if (nickels > 0) {
            cents = cents % 5;
            for (int i = 0; i < nickels; i++)
            {
                CurrencyCoinCent_5 coin = new CurrencyCoinCent_5();
                change.add(coin);
            }
        }
        _profit += cents;
        return change;
    }

    public Money sumCurrency(java.util.List<A_Currency> denominations)
    {
        int cents = 0;
        for (A_Currency money : denominations)
        {
            cents += money.getValue().getCentsTotal();
        }
        return new Money(cents);
    }
}
