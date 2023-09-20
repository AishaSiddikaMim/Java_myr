/*
class member declared private is not
accessible by any code outside its class, including subclasses.
*/

class A1 {
    int i; // public by default
    private int j; // private to A
    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// A1's j is not accessible here.
class B1 extends A1 {
    int total;
    void sum() {
        //total = i + j; // ERROR, j is not accessible here
    }
}

public class SimpleInheritanceRevisited2 {
    public static void main(String args[]) {
        B1 subOb = new B1();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
