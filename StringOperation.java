import java.util.Scanner;

public class StringOperation{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER STRING TO GET UPPERCASE LETTERS COUNT");
        System.out.println("enter exit in sting to terminate program");
        while (true){
            String str;
            System.out.println("Enter string");
            System.out.print(">>>> ");
            str = in.nextLine();
            if (str.equals("exit")){
                System.out.println("Thanks for using goodbye !");
                break;
            }
            int uppercaseLetters = getUppercaseLetterCount(str);
            System.out.println("uppercase letters count = " + uppercaseLetters);
        }
    }

    public static int getUppercaseLetterCount(String str){
        if (str.length() > 0){
            int count = 0;
            char character = str.charAt(0);
            if (character > 'A' && character < 'Z'){
                count = 1;
            }
            return (count + getUppercaseLetterCount(str.substring(1)));
        }
        return 0;
    }
}