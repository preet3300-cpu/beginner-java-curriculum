public class SmallestInArray {
    public static void main (String[] args) {
        int[] numbers = (8,9,10,45,2);

        int smallest = numbers[0]; 
        for (int i = 0; i < numbers.length; i++) {
            int item = numbers[i];
            if (item < smallest) {
                smallest = item
            }
        }
        System.out.println("The smallest item is" + smallest);
    }
}