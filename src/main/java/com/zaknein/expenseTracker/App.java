package com.zaknein.expenseTracker;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App {

    private static final File expenseFile = new File("expense.json");

    private static final ObjectMapper mapper = new ObjectMapper();

    

    public static void main(String[] args) throws IOException {

        AddParametros addParametros = new AddParametros();

        JCommander jc = JCommander.newBuilder()
                .addCommand("add", addParametros )
                .build();

        if(args.length == 0){
            jc.usage();
            return;
        }
        
        jc.parse(args);

        String parsedCommand = jc.getParsedCommand();

        switch (parsedCommand){
            case "add" -> add(addParametros);
        }

    }

    public static void add(AddParametros parametros) throws IOException {

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