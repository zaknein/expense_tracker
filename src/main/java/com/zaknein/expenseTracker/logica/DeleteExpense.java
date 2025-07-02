package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

public class DeleteExpense{

    private final ExpenseStorage expenseStorage;

    public DeleteExpense(ExpenseStorage expenseStorage){
        this.expenseStorage = expenseStorage;

    }

    public void remove(int id){
        expenseStorage.delete(id);
    }

}