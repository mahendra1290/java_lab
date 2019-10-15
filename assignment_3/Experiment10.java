package assignment3;

public class Experiment10 {
    public static void main(String[] args) {
        try {
            int [] array = new int[100000 * 100000];
        }
        catch (OutOfMemoryError ex){
            System.out.println("JVM can't allocate more memory");
        }
    }
}
