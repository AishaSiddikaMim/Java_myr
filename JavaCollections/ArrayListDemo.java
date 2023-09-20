import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String args[]) {
        List<String> al = new ArrayList<>();
        System.out.println("Size of al: " + al.size());

        // add elements to the array list
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        // display the array list
        System.out.println("Size of al: " + al.size());
        System.out.println("Contents of al: " + al);

        System.out.print("Contents of al(Using Index): ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + "  ");
        }
        System.out.println("");

        al.add(1, "A2");
        System.out.println("Size of al: " + al.size());
        System.out.println("Contents of al: " + al);

        // display the array list using lambda expression
        al.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Remove elements from the array list
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}