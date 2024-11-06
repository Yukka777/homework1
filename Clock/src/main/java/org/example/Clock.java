package org.example;

public class Clock implements Readable {
    private int hours;
    private int minuts;
    private int seconds;

public void setMinuts(int minuts){
    this.minuts = minuts;
}
public int getMinuts() {
    return this.minuts;
}

    public void setHours(int hours){
        this.hours = hours;
    }
    public int getHours() {
        return this.hours;
    }

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }
    public int getSeconds() {
        return this.seconds;
    }

    @Override
    public void tick() {
        setSeconds(this.seconds+1);
        System.out.println(seconds);

    }

    @Override
    public void readTime() {
        System.out.println(this.hours + ":" + this.minuts+ ":" + this.seconds);
    }
}