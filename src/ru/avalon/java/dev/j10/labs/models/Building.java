package ru.avalon.java.dev.j10.labs.models;

public class Building {
    private String color;
    private int floors;
    
    public Building (String color, int floors){
        this.color = color;
        this.floors = floors;
    }
    
    public String getBuildigDescription () {
        return color + " building with " + floors + "floors";
    }
    
    
}
