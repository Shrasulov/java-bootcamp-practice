public class Main {
    public static void main(String[] args){
        // 1. Факториал числа
        int n = 10;
        long res = 1;
        System.out.println("1. Факториал числа");
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);

        //⭐ Задача 4. Сумма цифр числа
        //👉 Вводим число, например 1234. Нужно посчитать 1+2+3+4 = 10.
        System.out.println("⭐ Задача 4. Сумма цифр числа");
        int number4 = 1234;
        int sum = 0;
        int num4 = number4;
        while (number4 > 0) {
            sum += number4 % 10;
            number4 /= 10;
        }
        System.out.printf("%s %4d = %d%n", "cумма", num4, sum);
        

        // ⭐ Задача 5. Простые числа до N
        //👉 Простое число — это число, которое делится только на 1 и само на себя.
        System.out.println("\nПростые числа до " + n + ":");
        int num5 = 50;
        for (int i = 2; i <= num5; i++) {
            boolean isPrime = true;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " : простое число");
            }
        }


        //⭐ Задача 6. Переворот числа
        //👉 Например: дано 12345. Результат: 54321.
        int number = 12345;
        int reversed = 0;
        System.out.println(" \n Переворот числа" + number);
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Перевёрнутое число: " + reversed);

    }
}