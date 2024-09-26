package src.main.java;

class EvenThread implements Runnable{

    Data data;

    public EvenThread(Data data) {
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data.lock){
            for(;data.counter<=data.n;data.counter++){
                if(data.counter % 2 == 1){
                    try {
                        data.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Even Number "+data.counter);
                data.lock.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


class OddThread implements Runnable{

    Data data;

    public OddThread(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        synchronized (data.lock){
            for(;data.counter<=data.n;data.counter++){
                if(data.counter % 2 == 0){
                    try {
                        data.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(data.counter <= data.n){
                    System.out.println("Odd Number "+data.counter);

                }
                //System.out.println("Odd Number "+data.counter);
                data.lock.notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class Data{
    int n=10;
    int counter =1;
    final Object lock = new Object();
}

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        Data data = new Data();
        EvenThread evenThread = new EvenThread(data);
        OddThread oddThread = new OddThread(data);

        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(oddThread);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
