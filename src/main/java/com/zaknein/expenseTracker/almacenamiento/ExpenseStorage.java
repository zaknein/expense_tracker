package com.zaknein.expenseTracker.almacenamiento;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaknein.expenseTracker.dominio.Expense;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public class ExpenseStorage {
    private static final File expenseFile = new File("expense.json");

    private static final ObjectMapper mapper = new ObjectMapper();


    // private final List<Expense> expenses;

    private HashMap<Integer,Expense> expenses = new HashMap<>();

    public ExpenseStorage() throws IOException {
        if (expenseFile.exists()) {
            expenses = mapper.readValue(expenseFile, mapper.getTypeFactory().constructMapLikeType(HashMap.class, Integer.class, Expense.class));
        } else {
            expenses = new HashMap<>();
        }
    }

    public void add(Expense expense) {
        // expenses.add(expense);
        expenses.put(expense.getId(), expense);
        save();
    }

    public List<Expense> list() {

        
        return new ArrayList(expenses.value());
    }


    public void delete(int id) {
        // expenses.removeIf((expense) -> expense.getId() == id);
        expenses.remove(id);
        save();
    }

    public void update(int id, Expense expense){
        expenses.replace(expense.getId(), expense);
        save();
    }

    public void save() {

        try {
           // expenseFile.createNewFile();
            mapper.writeValue(expenseFile, expenses);

        } catch (IOException e) {
            System.out.println("No existe archivo");
            e.printStackTrace();
        }

    }


}
