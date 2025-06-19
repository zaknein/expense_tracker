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

        Parametros parametros = new Parametros();

        JCommander jc = JCommander.newBuilder()
                .addCommand("parametros", parametros )
                .build();
        
        
        String result = args[0];

        switch (result){
            case "add":
                Expense expense = new Expense(10, "caca", 12);

                add(expense);
                break;

            case "delete":
                int id = 1 ;

                delete(id);
                break;

        }


    }

    public static void add(Expense expense) throws IOException {

        var list = new ArrayList<Expense>();

        if (expenseFile.exists()) {
            list = mapper.readValue(expenseFile, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Expense.class));
            list.add(expense);
        }

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