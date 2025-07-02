package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

public class SaveExpenseLogic {

    private final ExpenseStorage expenseStorage;

    public SaveExpenseLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }


    public void save(String description, Double amount) {
        int id = expenseStorage.list().size() + 1;
        Expense expense = new Expense(id, description, amount);
        expenseStorage.add(expense);
    }

}
