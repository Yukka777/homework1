package Clock.src.main.java.org.example;


import org.example.Clock;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.setHours(10);
        clock1.setMinuts(14);
        clock1.setSeconds(34);
        clock1.readTime();
        clock1.tick();
    }
}