package com.zaknein.expenseTracker.almacenamiento;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaknein.expenseTracker.dominio.Expense;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExpenseStorage {
    private static final File expenseFile = new File("expense.json");

    private static final ObjectMapper mapper = new ObjectMapper();


    private final List<Expense> expenses;

    public ExpenseStorage() throws IOException {
        if (expenseFile.exists()) {
            expenses = mapper.readValue(expenseFile, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Expense.class));
        } else {
            expenses = new ArrayList<>();
        }
    }

    public void add(Expense expense) {
        expenses.add(expense);
        save();
    }

    public List<Expense> list() {

        return expenses;
    }


    public void delete(int id) {
        expenses.removeIf((expense) -> expense.id() == id);
        save();
    }

    public void save() {

        try {
            mapper.writeValue(expenseFile, expenses);
        } catch (IOException e) {
            System.out.println("No existe archivo");
        }

    }


}
