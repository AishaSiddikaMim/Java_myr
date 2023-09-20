class C2 {
    int i;
}

class D2 extends C2 {
    int i; // this i hides the i in C2

    D2(int a, int b) {
        super.i = a; // i in C2
        i = b; // i in D2
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

public class UseSuper2 {
    public static void main(String[] args) {
        D2 subOb = new D2(1, 2);
        subOb.show();
    }
}
