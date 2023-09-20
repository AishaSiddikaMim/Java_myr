import java.util.Scanner;

public class problem3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter the size = ");
        int size;
        size = input.nextInt();
        int [] x = new int[size];
        System.out.println("Enter the elements = ");
        for(int i = 0; i < size; i++ ){
            x[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++ ) {
            if (x[i] < 0) {
                a++;
            }

        }
        System.out.println(a);
    }
}