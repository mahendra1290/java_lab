package assignment3;

import java.util.Random;
import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        int[] arr = new int[120];
        fillArrayRandomly(arr);
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("1. Enter index");
            System.out.println("2. Exit");
            int choice;
            choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {
                System.out.print(">>>> ");
                int index = in.nextInt();
                in.nextLine();
                try {
                    System.out.println(arr[index]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("out of bounds");
                }
            } else if (choice == 2) {
                break;
            }
        }
    }
    public static void fillArrayRandomly(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
    }
}



