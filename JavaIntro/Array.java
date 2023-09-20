public class Array {
    public static void main(String[] args) {
        //Initializing arrays when declared
        int [] numbers1 = {1,2,3,4,5};
        System.out.println("Array size = " + numbers1.length);
        for(int i  = 0; i <numbers1.length ; i++){
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();

        //Declaring arrays and allocating memory
        int[] numbers2 = new int[5];
        //int[] numbers2; // Declare arrays
        //numbers2 = new int[5]; // Allocate memory
        for(int i  = 0; i <numbers2.length ; i++){
            numbers2[i] = i;
        }

        for(int i  = 0; i <numbers2.length ; i++){
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        int[] numbers3 = new int[5];
        for(int i  = 0; i <numbers3.length ; i++){
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();
    }
}
