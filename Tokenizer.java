import java.util.Scanner;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        str = in.nextLine();
        String[] tokens = tokenize(str);
        for (String token : tokens){
            if (token.charAt(0) == 'b'){
                System.out.println(token);
            }
        }
    }

    public static String[] tokenize(String str){
        String[] list = str.split(" ");
        return list;
    }
}
