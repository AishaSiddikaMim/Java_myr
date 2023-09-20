public class Variable {
    public static void main(String[] args) {
        byte variable = 127;
        //byte variable = 200; //shows error
        System.out.println(variable);

        int a = 10;
        if (a > 0) // if (a) will give compilation error
        {
            System.out.println("Inside If");
        }
        boolean b = false;
        if (b)
        {
            System.out.println("Inside If");
        }
        else
        {
            System.out.println("Inside Else");
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean isWorker = true;

    }
}
