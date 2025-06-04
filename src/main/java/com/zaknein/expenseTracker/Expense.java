package com.zaknein.expenseTracker;

public record Expense(int id, String description, double amount) {
}

public class Parametros{
    @Parameter(
        names = "--description",
        description = "To add description of the purchase",
        requiered = true
    )
    private String description;


    @Parameter(
        names = "--amount",
        description = "To enter the amount of money spend",
        requiered = true
    )
    private Double amount;

    

}