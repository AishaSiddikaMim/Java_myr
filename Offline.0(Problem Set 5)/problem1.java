import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = input.nextInt();
        int[] x = new int[n];
        System.out.println("Value of array = ");
        for (int i = 0; i < n; i++){
            x[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (x[i] % 2 == 0) {
                x[i] = x[i] + 2;
                System.out.println(x[i]);
            }
            else if (x[i] % 2 != 0) {
                x[i] = x[i] +3;
                System.out.println(x[i]);
            }
        }
    }
}
