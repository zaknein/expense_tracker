package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

import java.time.LocalDateTime;
import java.util.List;

public class UpdateExpenseLogic {

    private final ExpenseStorage expenseStorage;

    public UpdateExpenseLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }


    public void update(int id, String description, Double amount) {

        LocalDateTime date = LocalDateTime.now();
        Expense updatedexpense = new Expense(id, description, amount, date);

        // List<Expense> expense = expenseStorage.list();

        // for(int i=0; i < expense.size(); i++){
        //     if(expense.get(i).getId() == id){
        //         expenseStorage.update(i, updatedexpense);
        //     }
        // }


        expenseStorage.update(id, updatedexpense);
    }

}
