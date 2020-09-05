package demo;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class Duoxiancheng {

    public static void logic(){
        System.out.println("1111");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /*System.out.println("--------m1--------");

        Thread t1 = new Thread("t1"){
            @Override
            public void run() {
                System.out.println("-------t1--------");
                LockSupport.park();
                System.out.println("-------t2--------");
            }
        };

        t1.start();
        System.out.println("--------m2--------");
        Thread.sleep(5000);
        System.out.println("--------m3--------");
        LockSupport.unpark(t1);*/

        final ReentrantLock lock = new ReentrantLock(true);

        Thread t1 = new Thread("t1"){
            @Override
            public void run() {
                lock.lock();
                System.out.println("-----t1-----");
                lock.unlock();
            }
        };

        Thread t2 = new Thread("t2"){
            @Override
            public void run() {
                lock.lock();
                System.out.println("-----t2-----");
                lock.unlock();
            }
        };

        t1.start();

        Thread.sleep(2000);

        t2.start();

    }
}
