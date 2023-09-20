public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5};
        for(int x: numbers1){
            System.out.print(x + " ");
        }
        System.out.println();

        double[] numbers2 = {1, 2, 3, 4, 5};
        for(double x: numbers2){
            System.out.print(x + " ");
        }
        System.out.println();

        int[][] numbers3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int[] x: numbers3){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
