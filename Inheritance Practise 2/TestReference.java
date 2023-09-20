class A3 {
   int i, j;
   void showij() {
       System.out.println(i+ " " +j);
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

        superOb = subOb;
        superOb.showij();

    }
}
