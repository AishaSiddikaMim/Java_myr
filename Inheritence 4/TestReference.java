class A3 {
    int i, j;

    void showij() {
        System.out.println(i+" "+j);
    }
}

class B3 extends A3 {
    int k;

    void showk() {
        System.out.println(k);
    }

    void sum() {
        System.out.println(i+j+k);
    }
}

public class TestReference {
    public static void main(String[] args) {
        B3 subOb = new B3();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        subOb.showk();
        subOb.showij();

        A3 superOb = new A3();
        superOb.i = 1;
        superOb.j = 2;
        superOb.showij();

        // can not assign B(sub-class) reference to A(super-class)
        //subOb = superOb;

        // assign A(super-class) reference to B(sub-class)
        superOb = subOb;
        superOb.showij();

        /*class A: superOb does not define a k member or showk() method
        super-class does not have any idea what sub-class adds to it*/
        //superOb.showk();
        //superOb.k = 5;
    }

}
