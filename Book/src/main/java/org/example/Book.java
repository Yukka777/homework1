package org.example;

public class Book implements Displayble{
    private String name;
    private String author;
    private int year;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

    @Override
    public void display() {
        System.out.println(this.name + this.author +  this.year);
    }
}
