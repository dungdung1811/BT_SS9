package BT_SS9.bt1;

public class Circle implements Resizeable {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea (){return radius*radius*Math.PI;};

    @Override
    public void resize(double percent) {
        this.radius *= 1+percent/100;
    }

    @Override
    public void displayResult() {
        System.out.println("Dienj tích hinình tròn dau khi tăng là: " + getArea());
    }
}
