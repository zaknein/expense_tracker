package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

import java.util.ArrayList;
import java.util.List;


public class SummaryLogic{
    private final ExpenseStorage expenseStorage;

    public SummaryLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }

    public void summary(String month){
        List<Expense> expensesValue = expenseStorage.summary();
        double totalSum = 0;
        int months = 0;
        boolean enteredMonth = true;
        if(month != null){
             month = month.toLowerCase();
            switch (month) {
                case "january":
                    months = 1;
                    break;
                case "february":
                    months = 2;
                    break;
                case "march":
                    months = 3;
                    break;
                case "april":
                    months = 4;
                    break;
                case "may":
                    months = 5;
                    break;
                case "june":
                    months = 6;
                    break;
                case "july":
                    months = 7;
                    break;
                case "august":
                    months = 8;
                    break;
                case "september":
                    months = 9;
                    break;
                case "october":
                    months = 10;
                    break;
                case "november":
                    months = 11;
                    break;
                case "december":
                    months = 12;
                    break;
            }
        }


        for(Expense i: expensesValue){
            if(month != null && months == i.getDate().getMonthValue()){
                totalSum += i.getAmount();
                System.out.println("Show all " + month + " expenses");
                System.out.printf("• [%d] %s - $%.2f - %s\n",
                        i.getId(),
                        i.getDescription(),
                        i.getAmount(),
                        i.getDate()
                );
            } else if (month != null && months != i.getDate().getMonthValue()) {
                enteredMonth = false;
            }else{
                totalSum += i.getAmount();
                System.out.printf("• [%d] %s - $%.2f - %s\n",
                        i.getId(),
                        i.getDescription(),
                        i.getAmount(),
                        i.getDate()
                );
                }
            }
        if(enteredMonth == false){
            System.out.println("No expenses found in " + month);
        }else {
            System.out.println("Total summary: " + totalSum);
        }
    }
}