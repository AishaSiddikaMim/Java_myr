public class MultiDimensionalArray {
    public static void main(String[] args) {
        //Initializing arrays when declared
        int[][] numbers1 = { {1,2,3}, {4,5,6}, {7,8,9} };

        for(int i=0; i<numbers1.length; i++){
            for(int j=0; j< numbers1[i].length ; j++){
                System.out.print(numbers1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Allocating same size second dimension
        int[][] numbers2 = new int[4][5];
        for(int i=0; i<numbers2.length; i++){
            for(int j=0; j< numbers2[i].length ; j++) {
                numbers2[i][j] = i+j;
            }
        }
        for(int i=0; i<numbers1.length; i++){
            for(int j=0; j< numbers1[i].length ; j++){
                System.out.print(numbers2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Allocating different size second dimension
        int[][] numbers3 = new int[4][];
        for(int i=0; i<numbers3.length; i++){
            numbers3[i] = new int[i+1];
        }

        for(int i=0; i<numbers3.length; i++){
            for(int j=0; j< numbers3[i].length ; j++) {
                numbers3[i][j] = i+j;
            }
        }
        for(int i=0; i<numbers3.length; i++){
            for(int j=0; j< numbers3[i].length ; j++){
                System.out.print(numbers3[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

    }

}
