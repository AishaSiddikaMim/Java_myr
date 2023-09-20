class Base1 {
    int a;
    Base1(int a)
    {
        this.a = a;
    }
    public static void show() {
        System.out.println("Static method of Super class");
    }
}

class Override1 extends Base1 {
    int b;
    Override1(int a, int b) {
        super(a);
        this.b = b;
    }

    // the following method overrides Base class's show()
    public static void show(){
        //super.show(); super can not be referenced from static context
        System.out.println("Static method of Sub class");
    }
}

public class StaticMethodHiding{
    public static void main(String[] args) {
        Base1 b1 = new Base1(10);
        b1.show();

        // Superclass refers to subclass
        //should b1.show call static method of superclass(Base1) or subclass(Override1)
        b1 = new Override1(10, 20);
        b1.show();
    }

}
