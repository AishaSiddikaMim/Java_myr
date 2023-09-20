class Ham{
    void a(){
        System.out.println("Ham a");
    }
    void b(){
        System.out.println("Ham b");
    }
    public String toString(){
    return "Ham";
    }
}
class Lamb extends Ham{
    void b(){
        System.out.println("Lamb b");

    }
}
class Yam extends Lamb{
    void a(){
        System.out.println("Yam a");

    }
    public String toString(){
        return "Yam";
    }
}
class Spam extends Yam{
    void a(){
        System.out.println("Spam a");
    }
}

public class Polymorphism {
    public static void main (String [] args){
        Ham[] food = { new Spam(), new Yam(), new Ham(), new Lamb() };
        for (int i = 0; i < food.length; i++) {
            Ham h1 = new Spam();
            System.out.println(food[i]);
            food[i].a();
            food[i].b();
            System.out.println();
        }
    }
}

