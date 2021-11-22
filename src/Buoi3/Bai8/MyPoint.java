package Buoi3.Bai8;

public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY (int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return  "(" + x + ", " + y + ")";
    }

    public float distance(int x, int y){
        float x1 = (float) Math.pow(this.x - x, 2);
        float y1 = (float) Math.pow(this.y - y, 2);
        return (float) Math.sqrt(x1 + y1);
    }

    public float distance(MyPoint myPoint){
        float x1 = (float) Math.pow(this.x - myPoint.getX(), 2);
        float y1 = (float) Math.pow(this.y - myPoint.getY(), 2);
        return (float) Math.sqrt(x1 + y1);
    }
}
