import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Get Triangle Area");
        while (true){
            System.out.println("enter points in form of < x y >");
            double[][] points = getPoints();
            double area = getTriangleArea(points);
            System.out.println("area of triangle is " + area);
        }
    }

    public static double[][] getPoints(){
        Scanner in;
        in = new Scanner(System.in);
        double [][] points = new double[3][2];
        for (int i=0; i<3; i++){
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
        }
        return points;
    }

    public static double getTriangleArea(double [][] points){
        int x = 0;
        int y = 1;
        double temp = 0;
        double area = ( points[0][x] * points[1][y] +
                        points[1][x] * points[2][y] +
                        points[2][x] * points[0][y] -
                        points[0][x] * points[2][y] -
                        points[1][x] * points[0][y] -
                        points[2][x] * points[1][y] ) / 2.0;
        return area;
    }
}
