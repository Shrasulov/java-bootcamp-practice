public class Main {
    public static void main(String[] args) {
        // используя интерфейс
        Thread test1 = new Thread(new Printer());
        test1.start();

        Thread test2 = new Thread(new Printer());
        test2.start();

        Thread test3 = new Thread(new Printer());
        test3.start();

        // через класс 
        SomeThreads t1 = new SomeThreads();
        t1.start();

        SomeThreads t2 = new SomeThreads();
        t2.start();
    }
}

// потоки через интерфейс Runnable
class Printer implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + " -> " + i
            );
        }
    }
}

// через класс Thread
class SomeThreads extends Thread{
    public void run(){
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName() + " class-- " + i);
        }
    }
}