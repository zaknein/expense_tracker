package com.zaknein.expenseTracker;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;


@Parameters(separators = "=")
public class AddParametros{
    @Parameter(
        names = "--description",
        description = "To add description of the purchase",
        required = true
    )
    private String description;


    @Parameter(
        names = "--amount",
        description = "To enter the amount of money spend",
        required = true
    )
    private Double amount;

    public String getDescription() { return description; }
    public double getAmount() { return amount; }

}