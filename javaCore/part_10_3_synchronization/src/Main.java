public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        // лямбда
        Runnable task=()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        // //обичный вариант для новичков
        // Runnable task = new Runnable() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i < 1000; i++) {
                    
        //         }
        //     } 
        // };

        Thread test1 = new Thread(task);
        Thread test2 = new Thread(task);

        test1.start();
        test2.start();

        test1.join();
        test2.join();


        System.out.println(counter.count);
    }
}
// // ответ не всегда верный потомучто потоки вмешиваются друг вдруга
// class Counter {
//     int count = 0;

//     void increment() {
//         count++;
//     }
// }

// 🛡️ Решение: synchronized
//💡 Теперь:
//    только один поток за раз
//     остальные ждут
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}