package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;

public class DeleteExpenseLogic {

    private final ExpenseStorage expenseStorage;

    public DeleteExpenseLogic(ExpenseStorage expenseStorage){
        this.expenseStorage = expenseStorage;

    }

    public void remove(int id){
        expenseStorage.delete(id);
    }

}