package com.zaknein.expenseTracker.dominio;


//public record Expense(int id, String description, double amount) {
//
//
//}


public class Expense {
    int id;
    String description;
    double amount;
    LocalDateTime date;

    public Expense() {
    }

    public Expense(int id, String description, double amount, LocalDateTime date) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.LocalDateTime = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setLocalDateTime(LocalDateTime date){
        this.LocalDateTime = date;
    }

    public LocalDateTime getLocalDateTime(){
        return date;
    }
}