package Bai6;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public float [] floats = {x,y};

    public Point2D(){
    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

   public float [] getXY() {
        return new float[]{floats[2]};
   }
   public void setXY(float x, float y){
   }
   public String toString(){
        return String.valueOf(x + y);
   }
}
