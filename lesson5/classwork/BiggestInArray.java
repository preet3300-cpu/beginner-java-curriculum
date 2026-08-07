public class BiggestInArray {
    public static void main (String[] args) {
        int[] numbers = {3,7,8,4,56,70};

        int biggest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int item = numbers[i];
        
        if (item > biggest) {
            biggest = item;
        }
    }
        System.out.println("The biggest item is:" + biggest);
    }
}