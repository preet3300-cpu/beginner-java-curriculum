import java.util.Random;

public class RandomNumber {
    public static void main (String[] args) {
        Random random = new Random();

        int num = random.nextInt(10) + 1; 
        System.out.println("A random number is:" + num);
    }
}