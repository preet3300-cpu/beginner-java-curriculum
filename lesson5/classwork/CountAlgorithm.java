public class CountAlgorithm {
    public static void main (String[] args) {
        String[] animals = {"Cat", "Dog", "Cat", "Tiger", "Lion"}; 
        
        int counter = 0;
        for (int i = 0; i < animals.length; i++) {
            String item = animals[i]; 
            if (item.equals("Cat")) {
                counter = counter + 1;
            }
            System.out.println(counter + "cats");
        }
    }
}