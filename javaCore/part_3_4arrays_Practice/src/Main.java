import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // задачи по 3 пункту
    public static void main(String[] arges) {
        // Слияние двух массивов
        // Есть два массива одинаковой длины. Создай третий, в котором каждый элемент — это сумма соответствующих элементов двух первых.
        System.out.println("1. Слияние двух массивов");
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int[] b = { 5, 4, 3, 2, 1 };
        int[] res = new int[a.length >= b.length ? a.length : b.length];
        for (int i = 0; i < res.length; i++) {
            res[i] += a[i] + b[i];
            System.out.println(res[i]);
        }

        // Сортировка массива (на выбор: вручную или через Arrays.sort())
        // Выведи массив до и после сортировки.
        System.out.println("\n\n2. Сортировка массива");

        // 1 через  Arrays.sort()
        System.out.println("Массив до сортировки: "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("Массив после сортировки: " + Arrays.toString(b));
        

        
        // 2  Пузырьковая сортировка:
        int[] arr={5,3,7,0,9,1,4,2};
        System.out.println("\n\nПузырьковая сортировка: ");
        System.out.println("Массив до сортировки: "+Arrays.toString(arr));
         for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
        

        // Двумерный массив
        // Создай матрицу 3x3, заполни её числами и выведи сумму всех элементов.
        System.out.println("\n\n3. Создай матрицу 3x3, заполни её числами и выведи сумму всех элементов.");
        int[][] matrix={
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);


        //Разделение строки
        //Введи строку из слов, разделённых пробелами, и выведи каждое слово на новой строке.(подсказка: split(" "))
        System.out.println("\n\n 4. Разделение строки");
        Scanner sc = new Scanner(System.in);
        //  строка для ввода:   I love learning Java programming
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (String w : words) {
            System.out.println(w);
        }


        // 🧩 Бонус-челленджи для прокачки:
        // Самое длинное слово
        // В строке "I love learning Java programming" найди самое длинное слово.
        System.out.println("\n\n 5. Самое длинное слово в строке");
        String leng = "";
        for (String w : words) {
            if (w.length() > leng.length()) {
                leng = w;
            }
        }
        System.out.println("Самое длинное слово в строке: " + leng + "  длиной: " + leng.length());
        
        sum = 0;
        // 6. Сумма диагоналей матрицы
        //Для матрицы 3x3 вычисли сумму главной диагонали.
        int count = 0;
        System.out.println("\n\n 6. Сумма диагоналей матрицы ");
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][count];
            count++;
        }
        System.out.println(sum);

        // 7. Переворот строки
        // Введи строку и выведи её наоборот (например, "Java" → "avaJ").
        System.out.println("\n\n 7. Переворот строки");
        String word = "java";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);

        // доп. задачи из плана
        //Поиск максимального и минимального элемента в массиве
        System.out.println("\n\n Поиск максимального и минимального элемента в массиве");
        int[] array = { 1, 3, 5, 7, 9, 0, 8, 13 };
        int max=array[0];
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("max= " + max + "\t min= " + min);
        

        //Проверка, является ли строка палиндромом
        System.out.println("\n\n Проверка, является ли строка палиндромом");
        String input = "java";
         // Нормализация: убираем пробелы, приводим к нижнему регистру
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String revers = new StringBuilder(cleaned).reverse().toString();
        
        if (cleaned.equals(revers)) {
            System.out.println("Это палиндром!");
        } else {
            System.out.println("Это не палиндром.");
        }
    }
}