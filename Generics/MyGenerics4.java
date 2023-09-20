class GenericMethod {
    private double val;

    public <T  extends Number> GenericMethod(T arg) {
        val = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val);
    }

    public static <V> boolean isIn(V x, V[] a) {
        for (V t : a) {
            if (t == x) return true;
        }
        return false;
    }
}

public class MyGenerics4 {
    public static void main(String args[]) {
        GenericMethod test = new GenericMethod(100);
        test.showVal();

        GenericMethod test2 = new GenericMethod(123.5);
        test2.showVal();

        Integer[] iArray = {1, 2, 3, 4, 5};
        System.out.println(GenericMethod.isIn(1, iArray));

        Double[] dArray = {1.2, 3.4, 5.6, 7.8, 9.1};
        System.out.println(GenericMethod.isIn(5.6, dArray));
    }
}