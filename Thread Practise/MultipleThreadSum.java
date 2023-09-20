class SumThread implements Runnable{
    public Thread t;
    public int sum = 0;
    private int start = 0;
    private int end = 0;
    private String name;
        SumThread(int start, int end, String name){
            this.start = start;
            this.end = end;
            this.name = name;
            this.t = new Thread(this, name);
            this.t.start();
        }
        public void run(){
            for(int i = start ; i<=end ; i++){
                sum=+i;
            }
        }
}

public class MultipleThreadSum {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(system.in);   // if tells to take user input
        //int a = scan.nextInt();
        //int b = scan.nextInt();
        //SumThread t1 = new SumThread(a, b, "One");
        SumThread t1 = new SumThread(1, 5, "One");
        //int a = scan.nextInt();               // if tells to take user input
        //int b = scan.nextInt();
        //SumThread t2 = new SumThread(a, b, "Two");
        SumThread t2 = new SumThread(6, 10, "Two");
        //int a = scan.nextInt();               // if tells to take user input
        //int b = scan.nextInt();
        //SumThread t3 = new SumThread(a, b, "Three");
        SumThread t3 = new SumThread(11,15, "Three");
        //int a = scan.nextInt();              // if tells to take user input
        //int b = scan.nextInt();
        //SumThread t4 = new SumThread(a, b, "Four");
        SumThread t4 = new SumThread(16,20, "Four");

        try{
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println(t1.sum + t2.sum + t3.sum +t4.sum);
    }
}