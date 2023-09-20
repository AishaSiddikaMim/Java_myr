import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Post code = " + a);
        if (a == 1206) {
            System.out.println("Area = Dhaka Cantonment");
        }
       else if (a == 1209) {
            System.out.println("Area = Jigatala");
        }
       else if (a == 1213) {
            System.out.println("Area = Banani");
        }
       else if (a == 1212) {
            System.out.println("Area = Badda");
        }
       else if (a == 1236) {
            System.out.println("Area = Dhania");
        }
       else if (a == 1332) {
            System.out.println("Area = Narisha");
        }
       else if (a == 1310){
            System.out.println("Area = Keraniganj");
        }
       else if (a == 1211){
            System.out.println("Area = Lalbag");
        }
       else if (a == 1216) {
            System.out.println("Area = Mirpur");
        }
       else {
            System.out.println("Could not found");
        }


    }
}
