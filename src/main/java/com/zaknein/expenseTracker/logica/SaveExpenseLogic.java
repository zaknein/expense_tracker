package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

import java.time.LocalDateTime;

public class SaveExpenseLogic {

    private final ExpenseStorage expenseStorage;

    public SaveExpenseLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }


    public void save(String description, Double amount) {
        LocalDateTime now = LocalDateTime.now();
        int id = expenseStorage.list().size() + 1;
        Expense expense = new Expense(id, description, amount, now);
        expenseStorage.add(expense);
    }

}
