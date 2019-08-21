import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    private int HeadCount;
    private int TailCount;
    enum Coin {head, tail};

    public static void main(String[] args) {
        play();
    }

    public static int flip(){
        Random rand = new Random();
        return rand.nextInt(2);
    }

    public static void play(){
        int heads = 0;
        int tails = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choices");
        System.out.println("1. Toss Coin");
        System.out.println("2. Show result");
        while (true) {
            int option = in.nextInt();
            if (option == 1) {
                int val = flip();
                if (val == 0) {
                    heads++;
                } else {
                    tails++;
                }
            } else {
                System.out.println("HEAD COUNT = " + heads + " TAIL COUNT = " + tails);
                break;
            }
        }
    }
}
