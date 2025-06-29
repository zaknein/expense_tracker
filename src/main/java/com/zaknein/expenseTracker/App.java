package com.zaknein.expenseTracker;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaknein.expenseTracker.comandos.AddExpense;
import com.zaknein.expenseTracker.comandos.ListExpenses;
import com.zaknein.expenseTracker.dominio.Expense;
import com.zaknein.expenseTracker.logica.SaveNewExpense;


public class App {

    private static final File expenseFile = new File("expense.json");

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {

        // Instnciamos comndos
        AddExpense addExpense = new AddExpense();
        ListExpenses listExpenses = new ListExpenses();

        // Instanciamos objetos de logica
        SaveNewExpense saveNewExpense = new SaveNewExpense();


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
            //case "add" -> add(addExpense);
            case "add" -> saveNewExpense.save( addExpense.getDescription(), addExpense.getAmount());

        }

    }

    public static void add(AddExpense parametros) throws IOException {

        var list = new ArrayList<Expense>();

        if (expenseFile.exists()) {
            list = mapper.readValue(expenseFile, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Expense.class));
            // list.add();
        }

        int newId = list.size() + 1;

        Expense newExpense = new Expense(newId, parametros.getDescription(), parametros.getAmount());
        list.add(newExpense);
        try {
            mapper.writeValue(expenseFile, list);
        } catch (IOException e) {
            System.out.println("No existe archivo");
        }


    }

    public static void list() throws IOException {
        List<Expense> list = mapper.readValue(expenseFile, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Expense.class));
    }

    public static void summary() {

    }

    public static void delete(int id) {

    }


}