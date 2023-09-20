class C1 {
    int i;

    C1() {this.i = -15;}
    C1(int i) {this.i = i;}
    C1(C1 c1) {this.i = c1.i;}

}

class D1 extends C1{
    int j, k;
    D1(){
        super();
        this.j = -38;
        this.k = -25;
    }

    D1(int i, int j, int k){
        super(i);
        this.j = j;
        this.k = k;
    }

    D1(D1 d1) {
        super(d1);
        this.j = d1.j;
        this.k = d1.k;
    }
}

public class UseSuper1 {
    public static void main(String[] args) {
    D1 d1 = new D1();
    D1 d2 = new D1(d1);
        System.out.println(d2.i);

    }

}
