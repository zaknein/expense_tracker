package com.zaknein.expenseTracker.comandos;

import com.beust.jcommander.Parameters;

@Parameters(
    commandNames = "summary",
    commandDescription = "Shows a summ of expenses"
)

public class Summary{

    @Parameter(
        name = "--month",
        description = "Month you whant to show the summary"
    )
    
    private int month;

    public int getMonth(){
        return month;
    }

    public void setMonth(){
        this.month = month;
    }

}