package task6.state;

import task6.Transaction;
import task6.ingredient.IngredientBaseCoffeeDecaf;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateBuildCoffeeBaseDecaf extends A_StateBuildCoffeeBase
{
    public StateBuildCoffeeBaseDecaf(Transaction transaction)
    {
        super(transaction);
        IngredientBaseCoffeeDecaf coffee = new IngredientBaseCoffeeDecaf();
        getTransaction().updateIngredientOuter(coffee);
    }
}
