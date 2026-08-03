public class Variables {
    public static void main(String[] args) {
        int age = 17; // int stores whole numbers
        double height = 1.81; // doubles is decimal storage
       String name = "Jocelynn S Cool"; // text is String
       boolean likesCoding = true; //boolean true/false

       System.out.println(age);
        System.out.println(height);
        System.out.println(name);
        System.out.println(likesCoding);
    
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        age = 18; // can change variable value.
        System.out.println(" Next year I will be "+ age + ".");
        
        height = 1.83;
        System.out.println(" Next year I will be " + height + " meters tall. ");
    }
}