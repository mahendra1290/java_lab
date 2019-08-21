public class Approx {

    public static void main(String[] args) {
        Approx pie = new Approx();
        double result = pie.getPieApprox(11);
        double result2 = pie.getPieApprox(13);

        System.out.println("approx till 1/11 is " + result);
        System.out.println("approx till 1/13 is " + result2);
    }

    public double getPieApprox(double limit) {
        int sign = 1;
        double result = 0;
        for (double i = 1; i <= limit; i += 2) {
            result += sign * (1.0 / i);
            sign *= -1;
        }
        result *= 4;
        return result;
    }
}