import java.util.Scanner; 

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Give me your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
        
        System.out.print("Give me an integer: ");
        int number = scanner.nextInt();
        System.out.println(number + 1); 

        System.out.print("Give me a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println(decimal * 2);

        scanner.close();
    }
}