class SumThread implements Runnable {

    public Thread t;
    public int sum = 0;
    private int start = 0;
    private int end = 0;

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.t = new Thread(this);
        this.t.start();
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum+=i;
        }
    }
}

public class MultipleThreadSum {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 200);
        SumThread t2 = new SumThread(201, 400);
        SumThread t3 = new SumThread(401, 600);
        SumThread t4 = new SumThread(601, 800);

        try {
            // wait for other threads to end
            t1.t.join();
            t2.t.join();
            t3.t.join();
            t4.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println(t1.sum + t2.sum + t3.sum + t4.sum);
    }
}
