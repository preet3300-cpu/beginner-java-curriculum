public class ArrayLength {
    public static void main (String[] args) {
        String[] fruits = {"apple", "dragonfruit","watermelon", "mango","blackberries","cherry","orange"};

        int length = fruits.length;  //number of items in the array
        System.out.println("Number of fruits:" + length); 

        String lastFruit = fruits[length - 1]; 
        System.out.println("Last fruit is:" + lastFruit); 
    }
}