package BT_SS9.bt1;

public class Square implements Resizeable {
    private double sideLength;

    // Constructor
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Phương thức tính diện tích của hình vuông
    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Phương thức tính chu vi của hình vuông
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    // Getter cho độ dài cạnh
    public double getSideLength() {
        return sideLength;
    }

    // Setter cho độ dài cạnh
    public void setSideLength(double sideLength) {
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            System.out.println("Độ dài cạnh phải lớn hơn 0.");
        }
    }




    @Override
    public void resize(double percent) {
        this.sideLength *= 1+percent/100;
    }

    @Override
    public void displayResult() {
        System.out.println("Diện tích hình vuông sau khi tăng " + calculateArea() );
    }
}
