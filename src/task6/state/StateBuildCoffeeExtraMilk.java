package task6.state;

import task6.Transaction;
import task6.ingredient.IngredientExtraMilk;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateBuildCoffeeExtraMilk extends A_StateBuildCoffeeExtra
{
    public StateBuildCoffeeExtraMilk(Transaction transaction)
    {
        super(transaction);
        IngredientExtraMilk milk = new IngredientExtraMilk(getTransaction().getIngredientOuter());
        getTransaction().updateIngredientOuter(milk);
    }
}
