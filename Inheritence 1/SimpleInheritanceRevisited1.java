class M{
    public int i;
    public void showi(){
        System.out.println(i);
    }
}

class N{
    public int j;
    public void showj(){
        System.out.println(j);
    }
}

/* case 1: Compile-time error
A class can not extend multiple classes that is
a sub-class must have a single superclass */
/*
class O1 extends M, N{
    public int k;
    public void showk(){
        System.out.println(k);
    }
}
*/

/* case 2: Multiple sub-classes can extend same super-class*/
class O2 extends M {

}

class O3 extends N{

}
/* case 3: Java does not allow cyclic inheritance that is
No class can be a super-class of itself*/
/*
class O3 extends O3{

}
*/

public class SimpleInheritanceRevisited1 {

}
