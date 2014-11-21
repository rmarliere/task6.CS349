package task6.state;

import task6.Transaction;
import task6.ingredient.IngredientExtraCream;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateBuildCoffeeExtraCream extends A_StateBuildCoffeeExtra
{
    public StateBuildCoffeeExtraCream(Transaction transaction)
    {
        super(transaction);
        IngredientExtraCream cream = new IngredientExtraCream(getTransaction().getIngredientOuter());
        getTransaction().updateIngredientOuter(cream);
    }
}
