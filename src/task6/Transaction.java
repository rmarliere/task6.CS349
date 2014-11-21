package task6;

import task6.ingredient.A_Ingredient;
import task6.money.A_Currency;
import task6.money.Money;

import java.util.ArrayList;
import java.util.List;

/**
 * task6
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class Transaction
{
    private Money _money;
    private A_Ingredient _ingredientOuter;
    private List<A_Ingredient> _ingredients;
    public Transaction()
    {
        _ingredients = new ArrayList<A_Ingredient>();
    }

    public Transaction(Money moneyTendered)
    {
        _money = moneyTendered;
    }

    public Money addMoneyTendered(A_Currency money)
    {
        _money = money.add(money);
        return _money;
    }

    public A_Ingredient getIngredientOuter()
    {
        if (!hasIngredientOuter())
            throw new RuntimeException("there is no outer ingredient");
        return _ingredientOuter;
    }

    public Money getMoneyTendered()
    {
        return _money;
    }

    public Money getProductCost()
    {
       return _ingredientOuter.getCostTotal();
    }

    public boolean hasIngredientOuter()
    {
        if (_ingredientOuter == null)
        {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString()
    {
        return "moneyTendered=" + _money.toString() + " ingredientOuter=" + _ingredientOuter.toString();
    }

    public List<A_Ingredient> unrollProduct()
    {
        return _ingredients;
    }

    public void updateIngredientOuter(A_Ingredient ingredient)
    {
        _ingredients.add(ingredient);
        _ingredientOuter = ingredient;
    }
}
