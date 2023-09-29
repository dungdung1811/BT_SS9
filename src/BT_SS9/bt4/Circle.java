package BT_SS9.bt4;

public class Circle extends Shape {
    private double radius;
    public Circle() {
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI ;
    }

}
