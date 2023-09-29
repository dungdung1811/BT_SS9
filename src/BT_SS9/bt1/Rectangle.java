package BT_SS9.bt1;

public class Rectangle implements Resizeable{
    private float length;
    private float width;

    public Rectangle() {
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double perimeter (){
        return 2*(this.length + this.width);
    }
    public double area(){
        return this.length*this.width;
    }

    @Override
    public void resize(double percent) {
        this.length *= (float) (1+percent/100);
        this.width *= (float) (1+percent/100);

    }

    @Override
    public void displayResult() {
        System.out.println("Diện tích hình chữ nhật sau khi tăng là: "+ area() );
    }
}
