package OddEvenWithThread;

class Printer {
    int counter = 1;

    void printOdd() {
        synchronized (this) {
            while (counter<10) {
                if(counter%2==0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                counter++;
                notify();
            }
        }
    }

    void printEven() {
        synchronized (this) {
            while (counter<10) {
                if(counter%2!=0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                counter++;
                notify();
            }
        }
    }
}

public class OddAndEvenWithThread {
    public static void main(String[] args) {

        Printer printer = new Printer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printEven();
            }
        }, "Even");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printOdd();
            }
        }, "Odd");

        t1.start();
        t2.start();
    }
}
