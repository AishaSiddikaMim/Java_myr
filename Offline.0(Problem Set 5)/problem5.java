import java.util.Scanner;

public class problem5{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sum = 0;
        float total = 0;
        float avg = 1 ;
        System.out.println("Enter the size = ");
        int size;
        size = input.nextInt();
        int [] x = new int[size];
        System.out.println("Enter the elements = ");
        for(int i = 0; i < size; i++ ){
            x[i] = input.nextInt();
        }
        for(int i = 0; i < size; i++ ) {
            total++;

            sum = sum + x[i];

            avg = sum / total;


            }
        System.out.println("Sum = "+ sum);
        System.out.println("Average = "+ avg);

        }
    }

