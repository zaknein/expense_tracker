package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

import java.util.List;

public class ListExpenseLogic {
    private final ExpenseStorage expenseStorage;

    public ListExpenseLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }

    public void show() {
        List<Expense> lista = expenseStorage.list();
        for (Expense expense :lista) {
            System.out.println("description " + expense.description());
        }

    }
}