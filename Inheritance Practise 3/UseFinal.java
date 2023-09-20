//Final Methods
//You can not override a final method
class A {
    final void meth() {
        System.out.println("This is a final method.");
    }
}

class B extends A {
    /*void meth(){
        System.out.println("Illegal!");
    }*/
}


//Final Class:
// If a class is defined final it can not be extended
final class C{}

//class D extends C{}


//Final Variables
//A final variable can only be initialized once,
//It is initialized either at the point of declaration or
// in EVERY constructor inside class where it is declared
class E {
    final int i;
    int j;

    E(){
        this.i = 10;
        this.j = -1;
    }

    E(int j){
        this.i = 10;
        this.j = j;
    }
}

class F extends E {
    int k;
    F(){
        //super.i = 0 //can not assign a value to final variable
        super();
        this.k = -1;
    }

    F(int j, int k){
        super(j);
        this.k = k;
    }
}
