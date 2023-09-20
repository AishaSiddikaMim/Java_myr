public class StaticTest {
    static int a = 3, b;
    int c;

    static {
        b = a*4;
        //c = b; // Error
    }

    static void f1(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //System.out.println("c = " + c); // Error
    }

    int f2() {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

        f1(42);
        StaticTest.f1(84);
        System.out.println("b = " + b);

        System.out.println(a);
        StaticTest ob1 = new StaticTest();
        ob1.a++;
        ob1.c++;
        System.out.println("a in ob1 = "+ ob1.a);
        System.out.println("c in ob1 = "+ ob1.c);

        StaticTest ob2 = new StaticTest();
        ob2.a++;
        ob2.c++;
        System.out.println("a in ob2 = "+ ob2.a);
        System.out.println("c in ob2 = "+ ob2.c);

        //System.out.println("Area = " + f2());   // Error
    }
}
