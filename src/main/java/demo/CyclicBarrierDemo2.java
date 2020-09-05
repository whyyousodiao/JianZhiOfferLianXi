package demo;

import java.util.concurrent.*;

public class CyclicBarrierDemo2 {
    private static final int threadCount = 550;

    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(5,()->{
        System.out.println("------当线程数达到之后，优先执行------");
    });

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < threadCount; i++) {
            final  int threadNum = i;
            Thread.sleep(1000);
            threadPool.execute(()->{
                try {
                    test(threadNum);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            });

        }
        threadPool.shutdown();

    }
    public static void test(int threadCount) throws InterruptedException, BrokenBarrierException, TimeoutException {
        System.out.println("threadCount = " + threadCount+ "isready");
        /*try{
            cyclicBarrier.await(60, TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println("--CyclicBarrierException");
        }*/
        cyclicBarrier.await();

        System.out.println("threadCount = " + threadCount+ "isfinish");

    }
}
