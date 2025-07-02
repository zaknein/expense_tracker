package com.zaknein.expenseTracker;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaknein.expenseTracker.almacenamiento.ExpenseStorage;
import com.zaknein.expenseTracker.comandos.AddExpense;
import com.zaknein.expenseTracker.comandos.ListExpenses;
import com.zaknein.expenseTracker.dominio.Expense;
import com.zaknein.expenseTracker.logica.SaveNewExpense;


public class App {


    public static void main(String[] args) throws IOException {

        // storage
        ExpenseStorage expenseStorage = new ExpenseStorage();

        // Instnciamos comndos
        AddExpense addExpense = new AddExpense();
        ListExpenses listExpenses = new ListExpenses();


        // Instanciamos objetos de logica
        SaveNewExpense saveNewExpense = new SaveNewExpense(expenseStorage);


        JCommander jc = JCommander.newBuilder()
                .addCommand("add", addExpense)
                .addCommand("list", listExpenses)
                .build();

        if (args.length == 0) {
            jc.usage();
            return;
        }

        jc.parse(args);

        String parsedCommand = jc.getParsedCommand();

        switch (parsedCommand) {

            case "add" -> SaveNewExpense.save( addExpense.getDescription(), addExpense.getAmount());
           // case "list" -> listExpenses
            case "delete" -> DeleteExpense.remove(id);

        }

    }


}