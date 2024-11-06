package Point.src.main.java.org.example;

public class Point implements Movable{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
    @Override
    public void moveUp() {
        setY(this.y+1);
    }
    @Override
    public void moveDown() {
        setY(this.y-1);
    }
    @Override
    public void moveLeft() {
        setX(this.x-1);
    }
    @Override
    public void moveRight() {
        setX(this.x+1);
    }
    @Override
    public void print() {
        System.out.println(this.x + this.y);
    }
}