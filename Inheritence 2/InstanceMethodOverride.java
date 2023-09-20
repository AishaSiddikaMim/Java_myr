class Base {
    int a;
    Base(int a) {
        this.a = a;
    }
    void show() {
        System.out.println("Inside Base class");
    }
}

class Override extends Base {
    int b;
    Override(int a, int b) {
        super(a);
        this.b = b;
    }
    // the following method overrides Base class's show()
    void show() {
        //super.show();
        System.out.println("Inside Override class");
    }
}

class Override2 extends Override {
    int c;
    Override2(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    // the following method overrides Base class's show()
    /*void show() {
        //super.show();
        System.out.println("Inside Override2 class");
    }*/
}

public class InstanceMethodOverride {
    public static void main(String[] args) {
        Override2 o = new Override2(10, 20, 30);
        o.show();
    }
}
