class Base1 {
    int a;

    Base1(int a) {
        this.a = a;
    }

    public static void show() {
        System.out.println("Static method of super class");
    }
}

class Override1 extends Base1 {
    int b;
    Override1(int a, int b){
        super(a);
        this.b = b;
    }
    public static void show() {
        System.out.println("Static method of sub class 1");
    }
}

class Override3 extends Override1 {
    int c;
    Override3(int a, int b, int c){
        super(a, b);
        this.c = c;
    }
    public static void show() {
        System.out.println("Static method of sub class 2");
    }
}

    public class StaticMethodHiding {
        public static void main(String[] args) {
            Base1 b1 = new Base1(10);
            b1.show();

            b1 = new Override1(10,20);
            b1.show();

            b1 = new Override3(10,20,30);
            b1.show();
        }

}
