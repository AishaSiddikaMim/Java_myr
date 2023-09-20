class C1 {
    int i;

    C1(){
        this.i = -1;
    }

    C1(int i){
        this.i = i;
    }

    C1(C1 c1){
        this.i = c1.i;
    }
}

class D1 extends C1 {
    int j,k;

    D1(){
        this.i = -1;
        //super(); //call super-class constructor
        this.j = -1;
        this.k = -1;
        //shows compile-time error super has to be the first statement of the constructor
        //super();
    }

    D1(int i, int j, int k) {
        super(i); //call super-class constructor
        //this.i = i;
        this.j= j;
        this.k = k;
    }

    D1(D1 d1){
        super(d1); // Why this line works? you are passing a reference of D1 object
                  // while the constructor's parameter is a reference of C1 object
        this.j = d1.j;
        this.k = d1.k;
    }

}

public class UseSuper1 {
    //How to call a constructor of super class?
    D1 subOb = new D1();

}
