public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Printer());
        t1.start();
        t1.join();
        System.out.println("Main finished");
        Thread t2 = new Thread(new Printer());
        t2.start();

    }
}

class Printer implements Runnable {
    public void run() {
        for (int i = 1; i <= 25; i++) {
            System.out.println(
                Thread.currentThread().getName() + " -> " + i
            );
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
        }
    }
}
