import java.awt.event.MouseAdapter;
import java.lang.Math;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers to find out minimum");
        while (true){
            float a = in.nextFloat();
            float b = in.nextFloat();
            float c = in.nextFloat();
            float min = minimumIn3(a, b, c);
            System.out.println("minimum out of three is " + min);
        }
    }

    public static float minimumIn3(float a, float b, float c){
        float min1 = Math.min(a, b);
        float min = Math.min(min1, c);
        return min;
    }
}
