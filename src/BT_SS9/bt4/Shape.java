package BT_SS9.bt4;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public void display(){
        System.out.println("Mau Sac là " +this.color);
    }

}
