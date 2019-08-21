public class MaxMin {
    public static void main(String[] args) {
        double possibleMax = Double.MAX_VALUE;
        double possibleMin = Double.MIN_VALUE;
        double a = 78.265156;
        double b = Math.nextUp(a);
        System.out.println("max double is " + possibleMax + "min double is " + possibleMin);
        System.out.println(a+" after nextUp is " + b);
    }
}
