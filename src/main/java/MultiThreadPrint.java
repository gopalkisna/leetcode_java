package src.main.java;

public class MultiThreadPrint extends Thread {

    public static final int TOTAL_THREADS  = 10;
    public static final Object object = new Object();
    private static volatile int counter=1;

    int thread_num;

    MultiThreadPrint(int num){
        this.thread_num = num;
    }

    @Override
    public void run() {

        synchronized (object){
           for(;counter<=100;){
               if(counter == thread_num || (counter%TOTAL_THREADS == thread_num) ||
                       ((counter%TOTAL_THREADS == 0) && (TOTAL_THREADS == thread_num))) {
                   System.out.println("Thread num "+thread_num + " prints "+counter++);
                   object.notifyAll();
               }else {
                   try {
                       object.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
        }
    }

    public static void main(String[] args) {

        for(int i=1;i<=TOTAL_THREADS;i++){
            MultiThreadPrint t1 = new MultiThreadPrint(i);
            t1.start();
        }
    }
}
