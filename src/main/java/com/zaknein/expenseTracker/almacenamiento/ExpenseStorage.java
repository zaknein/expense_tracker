package com.zaknein.expenseTracker.almacenamiento;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaknein.expenseTracker.dominio.Expense;

import java.io.File;
import java.util.List;

public class ExpenseStorage {
    private static final File expenseFile = new File("expense.json");

    private static final ObjectMapper mapper = new ObjectMapper();

    public void add(Expense expense){

    }

    public List<Expense> list(){

    }
}
