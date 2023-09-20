public class TestBox {
    public static void main(String[] args) {
        Box b1; // b1 refers to null;
        Box b2; // b2 refers to null;

        b1 = new Box(1, 3, 9); // b1 refers to new object (1, 3, 9);
        System.out.println(b1);

        b2 = b1; // b2 refers to b1, so both refers (1, 3, 9);
        System.out.println(b2);

        b1 = new Box(4, 8, 5); //b1 refers to new object (4, 8, 5);
        System.out.println(b1);
        System.out.println(b2);

        b1 = b2; // b1 refers to b2, what happens to object (4, 8, 5);
        System.out.println(b1);
        System.out.println(b2);

    }
}
