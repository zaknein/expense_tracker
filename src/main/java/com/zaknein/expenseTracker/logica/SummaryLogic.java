package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;


public class SummaryLogic{
    private final ExpenseStorage expenseStorage;

    public SummaryLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }

    public void summary(Integer month){

        if(month == null){
            System.out.println("Next will show all the expenses");
            expenseStorage.summary(month);
        }else{
            String months = "";
            switch (month) {
                case 1 -> months = "January";
            }
            System.out.println("Show all " + months + " expenses");
            expenseStorage.summary(month);
        }

    }


}