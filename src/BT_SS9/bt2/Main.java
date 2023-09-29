package BT_SS9.bt2;

public class Main {
    public static void main(String[] args) {
        Square[] square = new Square [4];
       Colorable colorable = new Square();
       square[0] = new Square(4,false);
       square[1] = new Square(3,true);
       square[2] = new Square(2,false);
       square[3] = new Square(1,true);
        for (Square arr :square) {
            if (arr.isColorable()){
                arr.howToColor();
                arr.display();
            }
        }
    }

}
