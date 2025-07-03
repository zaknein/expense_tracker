package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

public class UpdateExpenseLogic {

    private final ExpenseStorage expenseStorage;

    public UpdateExpenseLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }


    public void update(Int id, String description, Double amount) {
        Expense expense = new Expense(id, description, amount);
        expenseStorage.update(expense);
    }

}
