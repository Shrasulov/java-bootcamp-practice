import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //📘 Основные операции с массивами
        System.out.println(" Основные операции с массивами\n");

        //🔹 1. Инициализация массива
        //✅ Способ 1. Через new (создание пустого массива)
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 15;
        //✅ Способ 2. Через фигурные скобки
        int[] numbers1 = { 11, 3, 5, 7, 9 };
        //✅ Способ 3. Комбинированный
        int[] numbers2 = new int[] { 1, 2, 3, 4, 5 };

        //🔹 2. Обход массива
        //Чтобы обработать все элементы массива, используются циклы.
        //🔸 Обычный for
        System.out.println("Обход массыва");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("элемент " + i + "=" + numbers[i]);
        }
        
        //🔸 Улучшенный for-each (только для чтения)
        System.out.println("\n\n обход через for-each");
        for (int num : numbers1) {
            System.out.println(num);
        }


        //🔹 3. Поиск элемента в массиве
        //🔸 Линейный поиск (простой способ)
        System.out.println("\n\n линейный поиск массыва");
        int[] nums = { 1, 3, 2, 6, 9, 7 };
        int target = 9;
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("элемент найден на позиции: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("элемент не найден");
        }
        //📌 Этот способ перебирает все элементы по очереди — подходит для неотсортированных массивов.


        //🔹 4. Поиск максимального / минимального элемента
        System.out.println("\n\n Поиск макс числа: ");
        int[] numsm = { 2, 12, 4, 7, 1, 56 };
        int max = numsm[0];
        for (int i = 1; i < numsm.length; i++) {
            if (numsm[i] > max)
                max = numsm[i];
        }
        System.out.println("максимум равно: " + max);
        
        //🔹 5. Сумма и среднее элементов массива
        System.out.println("\n\n 5. Сумма и среднее элементов массива");
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }

        double average = (double) sum / nums.length;
        System.out.println("Cevvf = " + sum);
        System.out.println("Среднее = " + average);
        

        //🔹 6. Обратный обход массива
        System.out.println("\n\n 6. Обратный обход массива");
        for (int i = numsm.length - 1; i >= 0; i--) {
            System.out.println(numsm[i] + " ");
        }
        

        //🔹 7. Сравнение массивов
        /*
         * В Java нельзя просто написать arr1 == arr2, потому что это сравнит ссылки.
            Нужно использовать класс Arrays:
         */

        //import java.util.Arrays;
        System.out.println("\n\n 7. Сравнение массивов");
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println(Arrays.equals(a, b));


        //🔹 8. Копирование массива
        System.out.println("\n\n 8. Копирование массива");
        int[] original = { 1, 2, 3 };
        int[] copy = Arrays.copyOf(original, original.length);
        copy[0] = 99;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));



        //🧠 Практические задачи
        System.out.println("\n\n\n🧠 Практические задачи\n");

        // 1. Создай массив из 10 чисел и выведи только чётные.
        System.out.println("Создай массив из 10 чисел и выведи только чётные.");
        int[] arr = { 1, 3, 5, 21, 5, 7, 32, 632, 43, 6 };
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        // 2. Найди максимум, минимум и среднее значение массива.
        System.out.println("\n\n 2. Найди максимум, минимум и среднее значение массива.");
        sum = 0;
        max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            sum += i;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("сред значение = " + sum / arr.length);
        

        // 3. Напиши программу, которая ищет число в массиве (через Scanner).
        System.out.println("\n\n 3. Напиши программу, которая ищет число в массиве (через Scanner).");

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int faind =sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (faind == arr[i]) {
                System.out.println("число найден под позицию" + (i + 1));
            }
        }
        

        // 4. Выведи массив в обратном порядке.
        System.out.println("\n\n 4. Выведи массив в обратном порядке.");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        
        // 5. Создай новый массив, который является копией старого, но каждый элемент умножен на 2.
        System.out.println("\n\n 5. Создай новый массив, который является копией старого, но каждый элемент умножен на 2.");
        int[] originalarr = new int[] { 1, 2, 3, 4, 5 };
        int[] copyarr = new int[originalarr.length];
        for (int i = 0; i < originalarr.length; i++) {
            copyarr[i] = originalarr[i] * 2;
        }
        System.out.println("Оригинал: " + Arrays.toString(originalarr)); 
        System.out.println("Копия (умноженная на 2): " + Arrays.toString(copyarr));

        

    }
    
}
