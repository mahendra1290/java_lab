package assignment3;

public class Experiment1 {
    public static void main(String[] args) {
        if (args.length == 3) {
            double a = 0;
            double b = 0;
            int checked = 0;
            try {
                a = Double.parseDouble(args[0]);
                checked++;
                b = Double.parseDouble(args[2]);
                checked++;
            }
            catch (NumberFormatException ex) {
                System.out.print("Wrong input: ");
                if (checked < 1) {
                    System.out.println(args[0]);
                }
                else {
                    System.out.println(args[2]);
                }
                System.exit(-1);
            }
            String operator = args[1];
            System.out.println(calculate(a, operator, b));
        }
    }

    public static double calculate(double a, String operator, double b) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }
}
