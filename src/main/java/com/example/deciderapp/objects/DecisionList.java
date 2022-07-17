package com.example.deciderapp.objects;

import java.util.ArrayList;

public class DecisionList {

    private ArrayList<Category> allCategories;
    private ArrayList<Item> allItems;
    private String name;
    private String description;

    public DecisionList (){
        this.allCategories = new ArrayList<Category>();
        this.allItems = new ArrayList<Item>();
    }

    public DecisionList(ArrayList<Category> allCategories, ArrayList<Item> allItems, String name, String description) {
        this.allCategories = allCategories;
        this.allItems = allItems;
        this.name = name;
        this.description = description;
    }

    public ArrayList<Category> getAllCategories() {
        return allCategories;
    }

    public void setAllCategories(ArrayList<Category> allCategories) {
        this.allCategories = allCategories;
    }

    public ArrayList<Item> getAllItems() {
        return allItems;
    }

    public void setAllItems(ArrayList<Item> allItems) {
        this.allItems = allItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
