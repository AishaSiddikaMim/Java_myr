public class JoinAliveThreads {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread One is Alive : " + ob1.t.isAlive());
        System.out.println("Thread Two is Alive : " + ob2.t.isAlive());
        System.out.println("Thread Three is Alive : " + ob3.t.isAlive());

        try{
            System.out.println("Waiting for Threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Thread One is Alive : " + ob1.t.isAlive());
        System.out.println("Thread Two is Alive : " + ob2.t.isAlive());
        System.out.println("Thread Three is Alive : " + ob3.t.isAlive());
        System.out.println("Main Thread Exiting");
    }

}
