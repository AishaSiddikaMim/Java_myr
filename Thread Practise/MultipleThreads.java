class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        t.start();
    }
    public void run(){
        try{
            for(int i = 5; i>0; i--){
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + "exiting");
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
        try{
            Thread.sleep(20000);
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("MAIN thread exiting");
    }
}
