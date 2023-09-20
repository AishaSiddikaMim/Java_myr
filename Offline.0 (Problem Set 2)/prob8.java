import java.util.Scanner;
public class prob8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter four integers = ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        if (a > b && a > c && a > d ){
            System.out.println("largest = " + a);
        }
        else if (b > c && b > a && b > d ){
            System.out.println("largest = " + b);
        }
        else if (c > b && c > a && c > d ){
            System.out.println("largest = " + c);
        }
        else if (d > a && d > c && d > b ){
            System.out.println("largest = " + d);
        }
        if (a < b && a < c && a < d){
            System.out.println("Smallest =" + a);
        }
        if (b < a && b < c && b < d){
            System.out.println("Smallest =" + b);
        }
        if (c < b && c < a && c < d){
            System.out.println("Smallest =" + c);
        }
        if (d < b && d < c && d < a){
            System.out.println("Smallest =" + d);
        }


    }
}

