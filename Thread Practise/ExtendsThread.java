class NewThread2 extends Thread{
    NewThread2(){
        super("Extends Thread");
        start();
    }
    public void run(){
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
        try{
            for(int i = 5; i >0; i--){
                System.out.println("Child Thread :" + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}

public class ExtendsThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        new NewThread2();
    }
}
