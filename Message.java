class Message {
    public static void main(String[] args) {
        Simple messageBox = new Simple();
        for (int i = 0; i < 5; i++) {
            messageBox.displayMessages("I Love Java");
        }
    }

    public void displayMessages(String message) {
        System.out.println(message);
    }
}