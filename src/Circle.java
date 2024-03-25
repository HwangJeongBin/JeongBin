public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle c = new Circle(8);
        System.out.println(c.getArea());
    }
}