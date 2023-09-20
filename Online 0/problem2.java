import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size ;
        System.out.println("Enter the size = ");
        size = input.nextInt();
        int[] x = new int[size];
        int length = x.length;
        System.out.println("Enter elements = ");
        for (int i = 0; i < size; i++) {
            x[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (x[i] > x[j]) {
                    int a = x[i];
                    x[i] = x[j];
                    x[j] = a;
                }
            }
        }
        System.out.println("5th largest number = " + x[size - 5]);
    }
}



