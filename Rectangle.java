public class Rectangle {

    double length;
    double width;

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setSize(8.6, 5.3);
        System.out.println("area = " + rect.getArea());
        System.out.println("perimeter = " + rect.getPerimeter());
    }

    public void setSize(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}