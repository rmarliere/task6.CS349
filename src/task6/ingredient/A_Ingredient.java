package task6.ingredient;

import task6.money.Money;

import java.util.ArrayList;
import java.util.List;

/**
 * task6.ingredient
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public abstract class A_Ingredient
{
    private Money _cost;
    private String _description;
    private A_Ingredient _ingredientWrapped;

    public A_Ingredient(Money cost, String description)
    {
        _cost = cost;
        _description = description;
    }

    public A_Ingredient(Money cost, String description, A_Ingredient ingredientWrapped)
    {
        _cost = cost;
        _description = description;
        _ingredientWrapped = ingredientWrapped;
    }

    public Money getCost()
    {
        return _cost;
    }

    public Money getCostTotal()
    {
        List<A_Ingredient> ingredients = getIngredients();
        Money total = getCost();
        for (A_Ingredient ingredientWrapped : ingredients)
        {
            total = total.add(ingredientWrapped.getCost());
        }
        return total;
    }

    public String getDescription()
    {
        return _description;
    }

    public List<String> getDescriptionTotal()
    {
        List<String> descriptions = new ArrayList<String>();
        descriptions.add(getDescription());
        List<A_Ingredient> ingredients = getIngredients();
        for (A_Ingredient ingredientWrapped : ingredients)
        {
            descriptions.add(ingredientWrapped.getDescription());
        }
        return descriptions;
    }

    public List<A_Ingredient> getIngredients()
    {
        List<A_Ingredient> ingredients = new ArrayList<A_Ingredient>();
        if (hasIngredientWrapped())
        {
            ingredients.add(getIngredientWrapped());
            ingredients.addAll(getIngredientWrapped().getIngredients());
        }
        return ingredients;
    }

    public A_Ingredient getIngredientWrapped()
    {
        if (_ingredientWrapped == null)
            throw new RuntimeException("There is not a Ingredient Wrapped");
        return _ingredientWrapped;
    }

    public boolean hasIngredientWrapped()
    {
        return _ingredientWrapped != null;
    }

    @Override
    public java.lang.String toString()
    {
       return getClass().getSimpleName() + "{cost="+getCost().toString() + " description=["+ getDescription() + "]}";
    }
}
