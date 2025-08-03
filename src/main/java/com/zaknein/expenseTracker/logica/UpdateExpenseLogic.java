package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;


public class UpdateExpenseLogic {

    private final ExpenseStorage expenseStorage;

    public UpdateExpenseLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }

    public void update(int id, String description, Double amount) {

        Expense expense = expenseStorage.get(id);

        if(expense != null){
            if(amount != null) {
                expense.setAmount(amount);
            }
            if(description != null) {
                expense.setDescription(description);
            }

            Expense updatedexpense = new Expense(id, expense);

            expenseStorage.update(id, updatedexpense);
        }

    }

}
