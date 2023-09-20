class A1 {
    int i;
    private int j;
    void setij(int x, int y ){
        i = x;
        j = y;
    }
}

class B1 extends A1{
    int total;
    void sum() {

    }

}

public class SimpleInheritanceRevisited2 {
    public static void main(String[] args) {
        B1 subOb = new B1();
        subOb.setij (20,30);
        subOb.sum();
        System.out.println("Total is" + subOb.total);
    }
}
