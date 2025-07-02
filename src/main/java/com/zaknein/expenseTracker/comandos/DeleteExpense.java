package com.zaknein.expenseTracker.comandos;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

@Parameters(
        commandNames = "delete",
        commandDescription = "delete a expense"
)


public class DeleteExpense {



    @Parameter(
            names = "--id",
            description = "Id to delete",
            required = true
    )
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}
