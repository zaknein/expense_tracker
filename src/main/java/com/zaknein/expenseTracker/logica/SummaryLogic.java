package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;


public class SummaryLogic{
    private final ExpenseStorage expenseStorage;

    public SummaryLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }

    public void summary(int month){

        if(month == null){
            
        }

    }


}