class C3 {
    int i;

    C3() {this.i = -1;}
    C3(int i) {this.i = i;}
    C3(C3 c3) {this.i = c3.i;}

}

class D3 extends C3 {
    int j, k;

    D3() {
        super();
        this.j = -1;
        this.k = -1;
    }

    D3(int i, int j, int k) {
        super(i);
        this.j = j;
        this.k = k;
    }

    D3(D3 d3) {
        super(d3);
        this.j = d3.j;
        this.k = d3.k;
    }
}

class E3 extends D3 {
    int l,m,n;
    E3(){
        super();
        this.l = -1;
        this.m = -1;
        this.n = -1;

    }

    E3 (int i, int j, int k, int l, int m, int n){
        super(i, j, k);
        this.l = l;
        this.m = m;
        this.n = n;
    }

    E3(E3 e3){
        super(e3);
        this.l = e3.l;
        this.m = e3.m;
        this.n = e3.n;
    }
}

public class MoreSuper {
    public static void main(String[] args) {
            E3 e1 = new E3(1, 2, 3, 4, 5, 6);
            System.out.println(e1.i);
            System.out.println(e1.j);
            System.out.println(e1.k);
            System.out.println(e1.l);
            System.out.println(e1.m);
            System.out.println(e1.n);

        }
}
