public class MainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread = " + t);

        t.setName("Alpha");
        System.out.println("After name change = " + t);

        try {
            for(int n = 5;n>0;n--){
                System.out.println(n);
                Thread.sleep(10000);
            }
        } catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}
