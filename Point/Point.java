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
        this.y = y+1;
    }
    @Override
    public void moveDown() {
        this.y = y-1;
    }
    @Override
    public void moveLeft() {
        this.x = x-1;
    }
    @Override
    public void moveRight() {
        this.x = x+1;
    }

    @Override
    public void print() {
        System.out.println(this.x + " " + this.y);
    }
}