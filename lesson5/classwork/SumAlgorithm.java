public class SumAlgorithm {
    public static void main (String[] args) {
        int[] numbers = {5, 8, 35, 3, 6, 2};

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            int item = numbers[i];
            total = total + item; }
            System.out.println("The sum is:" + total);
    }
}