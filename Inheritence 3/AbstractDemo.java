abstract class S {
    // abstract method
    abstract void call();
    // concrete methods are still allowed in abstract classes
    void call2() {
        System.out.println("This is a concrete method");
    }
}

class T extends S {
    void call() {
        System.out.println("T's implementation of call");
    }
}

class U extends T{
    void call() {
        System.out.println("U's implementation of call");
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        //S is abstract; cannot be instantiated
        //S s = new S(); shows compile-time error

        S s; //this is ok - we have not created any object
        T t = new T();
        t.call();
        t.call2();
        U u = new U();
        u.call();
        u.call2();

        //Idea of polymorphism
        S s1 = new T();
        s1.call();
        s1.call2();
    }
}
