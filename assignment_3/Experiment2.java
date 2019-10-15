package assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        boolean continueInput = true;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("enter two numbers: ");
            try {
                a = in.nextDouble();
                b = in.nextDouble();
                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("invalid input please enter again");
            }
        }
        while (continueInput);
        double result = a * b;
        System.out.println("product of entered numbers is: " + result);
    }

    public static boolean isNumeric(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
