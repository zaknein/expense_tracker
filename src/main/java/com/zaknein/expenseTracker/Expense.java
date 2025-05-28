package com.zaknein.expenseTracker;


//public class Task {
//
//    int id;
//    date date;
//    String description;
//    Double amount;
//
//    public Task() {
//
//    }
//
//    public Task(Int id, Date date, String description, Double amount) {
//        this.id = id;
//        this.date = date;
//        this.description = description;
//        this.amount = amount;
//    }
//}

public record Expense(int id, String description, double amount) {
}