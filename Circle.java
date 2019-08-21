public class Circle {
    double radius;
    double pie = 3.14159;

    public static void main(String[] args) {
        Circle one = new Circle();
        one.setRadius(6.5);
        System.out.println("ares = " + one.getArea());
        System.out.println("perimeter = " + one.getPerimeter());
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * pie;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * pie * radius;
        return perimeter;
    }
}