package com.zaknein.expenseTracker.dominio;
import java.time.LocalDateTime;

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
        this.date = date;
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

    public void setDate(LocalDateTime date){
        this.date = date;
    }

    public LocalDateTime getDate(){
        return date;
    }
}