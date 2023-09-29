package BT_SS9.bt4;

public class Main {
    public static void main(String[] args) {
        Shape hinhtron = new Circle(4);
        Shape hinhvuong = new Rectangle(5,6);

        System.out.println("Dien tich hinh tron "+hinhtron.getArea());
        hinhtron.setColor(" red");
        System.out.println("mau cua hinh tron " + hinhtron.getColor());

        System.out.println("***************************");
        System.out.println("Dien tich hinh vuong " + hinhvuong.getArea());
        hinhvuong.setColor("mau vang");
        System.out.println("Mau cua cua hinh tron " + hinhvuong.getColor());
    }
}
