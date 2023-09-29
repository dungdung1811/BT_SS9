package BT_SS9.bt1;

public class Main {
    public static void main(String[] args) {
        Resizeable [] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3);
        resizeables[1] = new Rectangle(3,7);
        resizeables[2] = new Square(5);
        for (Resizeable arr:resizeables) {
            arr.resize(5);
            arr.displayResult();
        }

    }
}
