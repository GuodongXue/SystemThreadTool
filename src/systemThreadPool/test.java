package systemThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        //可缓存线程池
        //ExecutorService es = Executors.newCachedThreadPool();
        //定长线程池
        //ExecutorService es = Executors.newFixedThreadPool(3);
        //定时线程池
        //ScheduledExecutorService es = Executors.newScheduledThreadPool(3);
        //单例线程池
        ExecutorService es = Executors.newSingleThreadExecutor();
        //for(int i = 1; i<100; i++){
          //  es.execute(new testThread());
        //}
        for(int i = 1; i<100; i++){
            //es.schedule(new testThread(), 3, TimeUnit.SECONDS);
            es.execute(new testThread());
        }

        for(int i = 0; i<100; i++){
            //利用匿名内部类传入execute方法
            es.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Current thread is "+Thread.currentThread().getName());
                }
            });
        }
        es.shutdown();
    }
}
