package BT_SS9.bt2;

public class Square implements Colorable {
    private double size;
    private boolean Colorable;

    public Square() {
    }


    public Square(double size, boolean colorable) {
        this.size = size;
        Colorable = colorable;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isColorable() {
        return Colorable;
    }

    public void setColorable(boolean colorable) {
        Colorable = colorable;
    }
    public double getArea(){
        return this.size*size;
    }
    public void display(){
        System.out.println("dien tich hinh vuong la " + getArea());
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
