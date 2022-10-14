package Bai7.Resizeable;

public class Circle implements Resizeable{
        double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPetimeterCircle() {
        return (this.radius * this.radius) * Math.PI;
    }
    public double getAreaCircle() {
        return Math.pow(this.radius , 2) * Math.PI;
    }
    @Override
    public void reSize(double percent) {


    }
}
