public class Arrays {
    public static void main (String[] args) {
        String[] colors = {"red", "blue", "green", "yellow"}; 
        
        System.out.println(colors[0]); // array starting is always 0 not 1
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        colors[1] = "purple";
        System.out.println("New second color :" + colors[1]);

       // System.out.println(colors[10]); out of bouns is error!!!
    } 
}