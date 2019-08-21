public class Simple {

    public static void main (String[] args){
        Simple messageBox = new Simple();
        messageBox.displayMessages("Welcome to Java");
        messageBox.displayMessages("Learning Java Now");
        messageBox.displayMessages("and Programming is fun");
    }

    public void displayMessages(String message){
        System.out.println(message);
    }
}