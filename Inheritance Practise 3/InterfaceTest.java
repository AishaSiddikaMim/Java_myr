interface Callback
{
    void callback(int param);
}

interface Callback2{
    void callback2(int param);
}
class Client implements Callback, Callback2
{
    public void callback(int p)
    {
        System.out.println("callback called with " + p);
    }
    public void callback2(int p){ System.out.println("callback2 called with" + p); }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // Can't instantiate an interface directly
        //Callback c1 = new Callback();
        //c1.callback(21);

        Client c2 = new Client();
        c2.callback(42);

        // Accessing implementations through Interface reference
        Callback c3 = new Client();
        c3.callback(84);
    }
}

