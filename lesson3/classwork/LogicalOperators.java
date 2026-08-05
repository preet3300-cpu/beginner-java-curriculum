public class LogicalOperators {
    public static void main(String[] args) {
        int age = 14;
        boolean hasTicket = true;

        if (age >= 13 && hasTicket == true) {
            System.out.println("You can enter the PG-13 movie.");
        } else {
            System.out.println("Sorry, you can't watch this.");
        } 

        boolean hasPass = true;
        boolean hasCoins = false;

        if (hasPass == true || hasCoins == true) {
            System.out.println("You can ride the bus.");

        } else {
            System.out.println("You can't ride the bus.");
        }

        boolean homeworkDone = true;

        if (!(homeworkDone == true)) {
            System.out.println("Go finish you homework!");
        } else {
            System.out.println("Nice job! You're all done.");
        } 
    }
}