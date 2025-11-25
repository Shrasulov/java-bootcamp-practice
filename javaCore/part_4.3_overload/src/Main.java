public class Main {
    public static void main(String[] arges) {
        System.out.println("1. Метод info в 3 вариантах:");
        info();
        info("Amir");
        info("Amir", 21);

        System.out.println("\n2. Метод sum");
        System.out.println(sum(2, 4));
        System.out.println(sum(8, 6, 3));
        System.out.println(sum(3.4, 5.6));
        

        System.out.println("\n 3. Метод multiply ");
        multiply(4, 5);
        multiply(4.6, 4.5);
        multiply(4, 6, 9);
        
    }
    

    //1️⃣ Создай три метода info():
    // без параметров
    static void info() {
        System.out.println("Hi!");
    }
    // с String name
    static void info(String name) {
        System.out.println("Hi! " + name);
    }
    //с String name, int age
    static void info(String name, int age) {
        System.out.println("Привет! " + name + " тебе " + age);
    }



    //2️⃣ Создай три метода sum():
    // принимает 2 int
    static int sum(int a,int b){
        return a+b;
    }
    // принимает 3 int
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    // принимает double + double
    static double sum(double a, double b) {
        return a + b;
    }


    //3️⃣ Реализуй метод multiply():
    // multiply(int a, int b)
    static void multiply(int a, int b){
        System.out.println(a*b);
    }
    // multiply(double a, double b)
    static void multiply(double a, double b){
        System.out.println(a*b);
    }
    // multiply(int a, int b, int c)
    static void multiply(int a, int b, int c) {
        System.out.println(a*b*c);
    }
}