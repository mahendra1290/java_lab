import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two numbers to find gcd ");
        while (true){
            int a = in.nextInt();
            int b = in.nextInt();
            int gcd = getGcd(a, b);
            System.out.println("gcd is " + gcd);
        }
    }

    public static int getGcd(int a, int b){
        if (b == 0){
            return a;
        }
        return getGcd(b, a % b);
    }
}
