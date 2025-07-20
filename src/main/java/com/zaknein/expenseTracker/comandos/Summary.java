package com.zaknein.expenseTracker.comandos;

import com.beust.jcommander.Parameters;
import com.beust.jcommander.Parameter;

@Parameters(
    commandNames = "summary",
    commandDescription = "Shows a summ of expenses"
)

public class Summary{

    @Parameter(
        names = "--month",
        description = "Month you want to show the summary"
    )
    
    private int month;

    public int getMonth(){
        return month;
    }

    public void setMonth(){
        this.month = month;
    }

}