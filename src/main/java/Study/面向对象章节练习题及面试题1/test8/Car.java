package Study.面向对象章节练习题及面试题1.test8;

public class Car {
    private String brand;
    private int width;
    private String color;
    private double price;

    public Car() {
    }

    public Car(String brand, int width, String color, double price) {
        this.brand = brand;
        this.width = width;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car c1= new Car("宝马",123,"粉",10000);
        System.out.println(c1);
    }

}
