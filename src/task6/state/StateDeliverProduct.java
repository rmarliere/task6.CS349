package task6.state;

import task6.Transaction;
import task6.ingredient.A_Ingredient;

import java.util.List;

/**
 * task6.state
 * Author: Rodrigo de Barros Marliere
 * Revision date: 11/19/14
 * Assignment: Task 6
 * Class: CS 349
 */

public class StateDeliverProduct extends A_State
{
    public StateDeliverProduct(Transaction transaction)
    {
        super(transaction);
        String output = "[MACHINE] delivered\n";
        List<A_Ingredient> ingredientList = getTransaction().unrollProduct();
        for (A_Ingredient ingredient: ingredientList)
        {
            output = output + "-> " + ingredient.getDescription() + "\n";
        }
        System.out.println(output);
    }

    @Override
    public StateReturnChange doReturnChange()
    {
        return new StateReturnChange(getTransaction());
    }
}
