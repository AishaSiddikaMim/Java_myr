import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers = ");
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }

        }
    }
}
