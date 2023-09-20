public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 0,20, 0, 25, 10);
        System.out.println(t1);

        System.out.println(t1.p1);
        System.out.println(t1.p1.getX());
        t1.p1.setX(50);
        System.out.println(t1.p1.getX());

    }
}
