package Point.src.main.java.org.example;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.setX(5);
        point1.setY(7);
        point1.moveLeft();
        point1.print();
    }
}