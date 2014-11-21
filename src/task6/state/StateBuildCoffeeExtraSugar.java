package task6.state;

import task6.Transaction;
import task6.ingredient.IngredientExtraSugar;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateBuildCoffeeExtraSugar extends A_StateBuildCoffeeExtra
{
    public StateBuildCoffeeExtraSugar(Transaction transaction)
    {
        super(transaction);
        IngredientExtraSugar sugar = new IngredientExtraSugar(getTransaction().getIngredientOuter());
        getTransaction().updateIngredientOuter(sugar);
    }
}
