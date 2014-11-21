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

public class StateBuildCoffeeBaseRegular extends A_StateBuildCoffeeBase
{
    public StateBuildCoffeeBaseRegular(Transaction transaction)
    {
        super(transaction);
        IngredientBaseCoffeeRegular coffee = new IngredientBaseCoffeeRegular();
        getTransaction().updateIngredientOuter(coffee);
    }
}
