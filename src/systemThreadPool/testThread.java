package systemThreadPool;

public class testThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Current thread is "+Thread.currentThread());

    }
}
