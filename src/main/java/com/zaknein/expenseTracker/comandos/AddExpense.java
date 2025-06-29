package com.zaknein.expenseTracker.comandos;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(
        commandNames = "add",
        commandDescription = "Add a new expense"
)
public class AddExpense {

    @Parameter(
        names = "--description",
        description = "Description of th expense",
        required = true
    )
    private String description;

    @Parameter(
        names = "--amount",
        description = "The amount of money spend",
        required = true
    )
    private double amount;

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
}