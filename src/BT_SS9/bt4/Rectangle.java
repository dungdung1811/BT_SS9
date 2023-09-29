package BT_SS9.bt4;

public class  Rectangle extends Shape{

    private double width;
    private  double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }




    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
