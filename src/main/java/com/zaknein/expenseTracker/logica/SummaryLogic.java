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
        List<Expense> expensesValue;
        double totalSum = 0;
//        if(month == null){
//            System.out.println("Next will show all the expenses");
//            expensesValue = expenseStorage.summary();
//        }else{
        month.toLowerCase();
        int months = 0;
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
        System.out.println("Show all " + month + " expenses");
        expensesValue = expenseStorage.summary();


        for(Expense i: expensesValue){
            if(month != null && months == i.getDate().getMonthValue()){
                totalSum += i.getAmount();
                System.out.printf("• [%d] %s - $%.2f - %s\n",
                        i.getId(),
                        i.getDescription(),
                        i.getAmount(),
                        i.getDate()
                );
                System.out.println("Total summary: " + totalSum);
            }else{
                totalSum += i.getAmount();
                System.out.printf("• [%d] %s - $%.2f - %s\n",
                        i.getId(),
                        i.getDescription(),
                        i.getAmount(),
                        i.getDate()
                );
                System.out.println("Total summary: " + totalSum);}

        }
    }

//    double totalSum = 0;
//        if(month == null){
//        for(string i :expenses.values()){
//            totalSum += i.getAmount();
//            System.out.println(i);
//            System.out.println("Total summary: " + totalSum);
//        }else{
//            for(string i :expenses.values()){
//                if(month == expenses.getDate().getMonthValue()){
//                    totalSum += i.getAmount();
//                    System.out.println(i);
//                    System.out.println("Total summary: " + totalSum);
//                }else{
//                    System.ouy.println("There´s no expense in that mounth");
//                }
//            }
//
//
//        }
//    }

}