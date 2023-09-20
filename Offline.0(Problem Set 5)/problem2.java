import java.util.Scanner;

public class problem2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size = ");
        int size;
        size = input.nextInt();
        int [] x = new int[size];
        System.out.println("Enter the elements = ");
        for(int i = 0; i < size; i++ ){
            x[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++ ) {
            if (x[i] % 2 == 0) {
                int a = x[i] + 2;
                System.out.println(" " +a);

            } else if (x[i] % 2 != 0) {
                int b = x[i] + 3;
                System.out.println(" " +b);
            }

            System.out.println(" ");
        }
    }
}