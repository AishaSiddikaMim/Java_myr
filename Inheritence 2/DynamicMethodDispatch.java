class X1 {
    int a;
    void show(){
        System.out.println("Inside class X1");
    }
}

class Y1 extends X1 {
    int b;
    void show(){
        System.out.println("Inside class Y1");
    }
}

class Z1 extends Y1 {
    int c;
    void show(){
        System.out.println("Inside class Z1");
    }

}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        X1 x1= new X1();
        x1.show();

        //superclass refers subclass.
        // So will x1.show() call method show of superclass X1  or subclass Y1?
        x1 = new Y1();
        x1.show();

        x1 = new Z1();
        x1.show();

    }

}
