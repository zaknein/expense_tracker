package com.zaknein.expenseTracker.logica;

import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.dominio.Expense;

import java.util.ArrayList;
import java.util.List;


public class SummaryLogic {
    private final ExpenseStorage expenseStorage;

    public SummaryLogic(ExpenseStorage expenseStorage) {
        this.expenseStorage = expenseStorage;
    }

    public void summary(String month) {
        List<Expense> expensesValue = expenseStorage.list();

        double totalSum = 0;

        int monthValue = 0;

        boolean haveExpenseToSum = false;

        if (month != null) {
            month = month.toLowerCase();
            switch (month) {
                case "january":
                    monthValue = 1;
                    break;
                case "february":
                    monthValue = 2;
                    break;
                case "march":
                    monthValue = 3;
                    break;
                case "april":
                    monthValue = 4;
                    break;
                case "may":
                    monthValue = 5;
                    break;
                case "june":
                    monthValue = 6;
                    break;
                case "july":
                    monthValue = 7;
                    break;
                case "august":
                    monthValue = 8;
                    break;
                case "september":
                    monthValue = 9;
                    break;
                case "october":
                    monthValue = 10;
                    break;
                case "november":
                    monthValue = 11;
                    break;
                case "december":
                    monthValue = 12;
                    break;

            }
        }
        if (month != null) {
            System.out.println("Show all " + month + " expenses");
        }else {
            System.out.println("Show all expenses");
        }
        for (Expense i : expensesValue) {
            if(month == null || monthValue == i.getDate().getMonthValue()){
                totalSum += i.getAmount();
                System.out.printf("• [%d] %s - $%.2f - %s\n",
                        i.getId(),
                        i.getDescription(),
                        i.getAmount(),
                        i.getDate()
                );
                haveExpenseToSum = true;
            }
//            if (month != null && monthValue == i.getDate().getMonthValue()) {
//                totalSum += i.getAmount();
//                System.out.printf("• [%d] %s - $%.2f - %s\n",
//                        i.getId(),
//                        i.getDescription(),
//                        i.getAmount(),
//                        i.getDate()
//                );
//                haveExpenseToSum = true;
//                theMonthHaveExpense = true;
//
//            } else if (month != null && monthValue != i.getDate().getMonthValue()) {
//                theMonthHaveExpense = false;
//            } else {
//                totalSum += i.getAmount();
//                System.out.printf("• [%d] %s - $%.2f - %s\n",
//                        i.getId(),
//                        i.getDescription(),
//                        i.getAmount(),
//                        i.getDate()
//                );
//                haveExpenseToSum = true;
//                theMonthHaveExpense = true;
//            }
        }
        if (monthValue == 0 && !haveExpenseToSum) {
            System.out.println("No expenses found");
        }else if(month != null && !haveExpenseToSum){System.out.println("No expenses found in " + month);}
        else{System.out.println("Total sum: " + totalSum);}

    }
}