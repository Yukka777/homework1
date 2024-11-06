package org.example;

public class Student implements Printable{
    private String name;
    private int number_card;
    private int score;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setNumber_card(int number_card){
        this.number_card = number_card;
    }
    public int getNumber_card(){
        return this.number_card;
    }

    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }

    @Override
    public void print() {
        System.out.println(this.name + this.number_card + " " +this.score);
    }
}
