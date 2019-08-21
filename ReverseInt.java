import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args){
        Scanner in;
        in = new Scanner(System.in);
        while (true) {
            int num;
            num = in.nextInt();

        }
        reverseDisplay(num);
    }

    public static void reverseDisplay(int num){
        do {
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
        }
        while (num > 0);
    }
}
