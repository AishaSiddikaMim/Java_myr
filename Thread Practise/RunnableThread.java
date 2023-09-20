class NewThread1 implements Runnable{
    Thread t;
    NewThread1(){
        t = new Thread(this,"Runnable Thread");
        //1st argument : the class which is implementing the runnable interface
        //2nd argument : Name of the Thread
        t.start();
    }
    public void run(){
        try{
            for (int i = 5; i>0; i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Exiting Child Thread ");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        new NewThread2();
    }
}
