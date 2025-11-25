//Параметры и возвращаемые значения

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] arges) {

        System.out.println("10. метод возврашаюшый несколько значеный (массив)");
        int[] arr={1,3,5,7,2,9};
        int[] res=minMax(arr);
        System.out.println(Arrays.toString(res));

        System.out.println("2. проверка четности");
        boolean ok = isEven(5);
        System.out.println(ok);

        System.out.println("3. Максимум из двух чисел");
        System.out.println(max(5, 8));

        System.out.println("4. Конкатенация строк");
        System.out.println(join("java", "Core"));

        System.out.println("5. Среднее из трёх чисел");
        System.out.println(average(4, 9, 5));

        System.out.println("6. Сколько букв в строке");
        int counts = countChars("sfkdnvflsj");
        System.out.println(counts);

        System.out.println("7. Подсчёт суммы массива");
        int[] array = { 1, 4, 7, 9, 3, 8 };
        System.out.println(sum(array));

        System.out.println("8. Поиск минимального числа в массиве");
        System.out.println(min(array));

        System.out.println("9. Проверка строки на палиндром");
        System.out.println(isPalindrome("radar"));
    }
    // 💣 10. Возврат нескольких значений
    //использовать return new int[]{a, b};
    static int[] minMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int arr : array) {
            if (arr < min)
                min = arr;
            if (arr > max)
                max = arr;
        }
        return new int[] { min, max };
    }

    //2. Проверка чётности
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    //3. Максимум из двух чисел
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    //4. Конкатенация строк
    static String join(String a, String b) {
        return a + " " + b;
    }

    //5. Среднее из трёх чисел
    static double average(int a, int b, int c) {
        return a + b + c;
    }

    //6. Сколько букв в строке
    static int countChars(String s) {
        int count = 0;
    
        // Проходим по каждому символу строки с помощью цикла foreach
        for (char c : s.toCharArray()) {
            count++;
        }
    
        return count;
    }
    
    //7. Подсчёт суммы массива
    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    //🔥 Задача 8 — Поиск минимального числа в массиве
    static int min(int[] arr) {
        int min = arr[0];
        for (int a : arr) {
            if (min > a)
                min = a;
        }
        return min;
    }

    //🔥 Задача 9 — Проверка строки на палиндром
    public static boolean isPalindrome(String s) {
        // Приводим строку к нижнему регистру и убираем пробелы
        String cleanString = s.toLowerCase().replace(" ", "");

        int left = 0;
        int right = cleanString.length() - 1;

        // Сравниваем символы с обоих концов
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
