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


    // private final List<Expense> expenses;

    private final map<Expense> expenses;

    HashMap<Integer,expenses> theexpense = new HashMap<>();

    public ExpenseStorage() throws IOException {
        if (expenseFile.exists()) {
            expenses = mapper.readValue(expenseFile, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Expense.class));
        } else {
            expenses = new ArrayList<>();
        }
    }

    public void add(Expense expense) {
        // expenses.add(expense);
        theexpense.put<expenses.getId(), expense>;
        save();
    }

    public List<Expense> list() {

        return expenses;
    }


    public void delete(int id) {
        // expenses.removeIf((expense) -> expense.getId() == id);
        expense.remove(id);
        save();
    }

    public void update(int id, Expense expense){
        // expenses.set(id, expense);
        theexpense.replace(expenses.getId(), expense)
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
