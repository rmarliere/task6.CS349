package task6.ingredient;

import task6.money.Money;

/**
 * task6.ingredient
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public abstract class A_IngredientExtra extends A_Ingredient
{
    public A_IngredientExtra(Money cost, String description, A_Ingredient ingredientWrapped)
    {
        super(cost, description, ingredientWrapped);
    }
}
