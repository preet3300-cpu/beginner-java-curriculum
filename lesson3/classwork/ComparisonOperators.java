public class ComparisonOperators {
    public static void main(String[] args) {
        System.out.println(5 > 3); //Compares the value and says true or false
        System.out.println(5 < 3);
        System.out.println(5 >= 5);
        System.out.println(4 <= 4);
        System.out.println(5 == 5); //two equals signs for equal!!!
        System.out.println(5 != 5); // Not equal is !=

        // you can compare variables too!
        int a = 10;
        int b = 7;
        System.out.println(a > b);
        System.out.println(a == b);

        String word1 = "apple";
        String word2 = "apple";
        System.out.println(word1.equals(word2));
    }
}