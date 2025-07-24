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
            month.toLowerCase()
            Integer months = "";
            switch (month) {
                case "january":
                    months = 1;
                    break
                case "february"
                    months = 2;
                    break
                case "march":
                    months = 3;
                    break
                case "april":
                    months = 4;
                    break
                case "may":
                    months = 5;
                    break
                case "june":
                    months = 6;
                    break
                case "july":
                    months = 7;
                    break
                case "august":
                    months = 8;
                    break
                case "september":
                    months = 9;
                    break
                case "october":
                    months = 10;
                    break
                case "november":
                    months = 11;
                    break
                case "december":
                    months = 12;
                    break
            }
            System.out.println("Show all " + month + " expenses");
            expenseStorage.summary(months);
        }

    }


}