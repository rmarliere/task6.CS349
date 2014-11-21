package task6.ingredient;

import task6.money.Money;

/**
 * task6.ingredient
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class IngredientBaseCoffeeRegular extends A_IngredientBase
{
    public IngredientBaseCoffeeRegular()
    {
        super(new Money(1, 50), "coffee regular");
    }
}
