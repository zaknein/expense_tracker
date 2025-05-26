package com.zaknein.expenseTracker;

import java.io.IOException;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task{

    Int id;
    Date date;
    String description;
    Double amount;

    public Task(){

    }

    public Task(Int id, Date date, String description, Double amount){
        this.id = id;
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    





}