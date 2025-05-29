package com.zaknein.expenseTracker;

import java.io.IOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;


public class App {

    private static final File expenseFile = new File("expense.json");

    private static final ObjectMapper mapper = new ObjectMapper();



    public static void main(String[] args) throws IOException {


        Expense expense = new Expense(10, "caca", 12);
    }
    
    public static void add(Expense expense){

        var list = new ArrayList<Expense>();

        if(expenseFile.exists()){
            list = mapper.readValue(expenseFile, mapper.getTypeFactory().constructCollectionType(ArrayList.class, Expense.class));
            list.add(Expense);        
        }

        try {
            mapper.writeValue(expenseFile, lista);
        } catch (IOException e) {
            System.out.println("No existe archivo");
        }
        

    }
    public static void list(){

    }
    public static void summary(){

    }
    public static void delete(){

    }









}