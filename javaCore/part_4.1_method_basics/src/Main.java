//⚙️ Методы в Java: объявление и вызов
public class Main {
    public static void main(String[] arges) {
        //🧩 Мини-практика
        System.out.println("Мини-практика");
        System.out.println("1. Напиши метод printHello()");
        printHello();
        System.out.println("2. Создай метод, который возвращает квадрат числа.");
        square(5);
        System.out.println("3. Сделай метод, который печатает сообщение:");
        greetUser("Амир", 21);
        System.out.println("4. Напиши метод sum");
        sum(3, 5, 7);
        System.out.println("5. Сделай метод isPositive");
        isPositive((-5));

    }
    
    //1️⃣ Напиши метод printHello(), который просто выводит “Hello, world!”.
    public static void printHello() {
        System.out.println("Hello, world!");
    }

    //2️⃣ Создай метод square(int x), который возвращает квадрат числа.
    public static void square(int x) {
        System.out.println(Math.pow(x, 2));
    }

    //3️⃣ Сделай метод greetUser(String name, int age), который печатает сообщение вроде:
    //"Привет, Амир! Тебе 22 года."
    public static void greetUser(String name, int age) {
        System.out.println("Привет, " + name + "! Тебе " + age + " года.");
    }
    
    //4️⃣ Напиши метод sum(int a, int b, int c), который возвращает сумму трёх чисел.
    public static void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    
    //5️⃣ Сделай метод isPositive(int num), который возвращает true, если число положительное, и false — иначе.
    public static void isPositive(int num) {
        boolean ok = num > 0;
        System.out.println(ok);
    }
} 