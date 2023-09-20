class A {

    int i, j;

    void showij() { System.out.println(i+ " " +j); }

}

class B extends A {

    int k;

    void showk(){ System.out.println(k); }

    void sum() { System.out.println(i+j+k); }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        superOb.i = 15;
        superOb.j = 29;
        superOb.showij();

        B subOb = new B();
        subOb.i = 30;
        subOb.j = 31;
        subOb.k = 33;
        subOb.showij();
        subOb.showk();
        subOb.sum();
        superOb.showij();
    }
}
