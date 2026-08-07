public class SearchArray {
    public static void main (String[] args) {
String[] fruits = {"apple", "dragonfruit","watermelon", "mango","blackberries","cherry","orange"};
boolean found = false;
int index = -1;

for (int i = 0; i < fruits.length; i++) {
    String item = fruits[i];
    if (item.equals("apple")) {
        found = true;
        index = i;
        break;
    }
}
    if (found == true) {
        System.out.println("Found apple at" + index);
    }
    else {
        System.out.println("no apples here!");
    }
    }
}