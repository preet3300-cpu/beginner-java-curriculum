public class LoopingThroughArrays {
    public static void main (String[] args) {
        String[] animals = {"cat", "dog","tiger","lion"};

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]); // print the item at each index
        }

        int[] numbers = {4,6,9,2,0,1};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }     
    }
}