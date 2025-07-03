package com.zaknein.expenseTracker.comandos;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(
        commandNames = "update",
        commandDescription = "Update a expense"
) 

public class UpdateExpense{

        @Parameter(
            names = "--id",
            description = "Id of the expense",
            required = true
        )

        private int id;

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

}