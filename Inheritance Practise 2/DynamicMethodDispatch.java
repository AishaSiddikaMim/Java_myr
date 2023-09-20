class X1 {
    int a;
    void show() {
        System.out.println("Inside X1 class");
    }
}

class Y1 extends X1 {
    int b;
    void show() {
        System.out.println("Inside Y1 class");
    }
}

class Z1 extends Y1{
    int c;
    void show() {
        System.out.println("Inside Z1 class");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        X1 x1 = new X1();
        x1.show();

        x1 = new Y1();
        x1.show();

        x1 = new Z1();
        x1.show();


    }
}
