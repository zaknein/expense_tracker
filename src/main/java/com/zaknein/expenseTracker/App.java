package com.zaknein.expenseTracker;

import java.io.IOException;

import com.beust.jcommander.JCommander;
import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.comandos.AddExpense;
import com.zaknein.expenseTracker.comandos.DeleteExpense;
import com.zaknein.expenseTracker.comandos.ListExpenses;
import com.zaknein.expenseTracker.logica.DeleteExpenseLogic;
import com.zaknein.expenseTracker.logica.ListExpenseLogic;
import com.zaknein.expenseTracker.logica.SaveExpenseLogic;
import com.zaknein.expenseTracker.logica.UpdateExpenseLogic;

public class App {


    public static void main(String[] args) throws IOException {

        // storage
        ExpenseStorage expenseStorage = new ExpenseStorage();

        // Instanciamos comandos
        AddExpense addExpense = new AddExpense();
        ListExpenses listExpenses = new ListExpenses();
        DeleteExpense deleteExpense = new DeleteExpense();
        UpdateExpense updateExpense = new UpdateExpense();

        // Instanciamos objetos de logica
        SaveExpenseLogic saveNewExpense = new SaveExpenseLogic(expenseStorage);
        DeleteExpenseLogic deleteExpenseLogic = new DeleteExpenseLogic(expenseStorage);
        ListExpenseLogic listExpenseLogic = new ListExpenseLogic(expenseStorage);
        UpdateExpenseLogic updateExpenseLogic = new UpdateExpenseLogic(expenseStorage);


        JCommander jc = JCommander.newBuilder()
                .addCommand("add", addExpense)
                .addCommand("list", listExpenses)
                .addCommand("delete", deleteExpense)
                .addCommand("update", updateExpense)
                .build();

        if (args.length == 0) {
            jc.usage();
            return;
        }

        jc.parse(args);

        String parsedCommand = jc.getParsedCommand();

        switch (parsedCommand) {

            case "add" -> saveNewExpense.save( addExpense.getDescription(), addExpense.getAmount());
            case "list" -> listExpenseLogic.show();
            case "delete" -> deleteExpenseLogic.remove(deleteExpense.getId());
            case "update" -> updateExpenseLogic.update(updateExpense.getId, updateExpense.getDescription, updateExpense.getAmount());

        }

    }


}