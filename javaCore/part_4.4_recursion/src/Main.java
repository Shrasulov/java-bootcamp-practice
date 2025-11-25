public class Main {
    public static void main(String[] arges) {

        System.out.println("1. Сумма чисел от 1 до N (через рекурсию)");
        System.out.println(sum(10));

        System.out.println("2. Вывести числа от 1 до N (рекурсивно)");
        int num = 10;
        printNumbers(num);

        System.out.println("3. Найти факториал");
        int res = factorial(num);
        System.out.println(res);

        System.out.println("4. Рекурсивно вывести строку задом наперёд");
        printReverse("java");

        System.out.println("Задачи посложнее");
        System.out.println("5. Количество цифр в числе (через рекурсию");
        System.out.println(" = "+countDigits(123450));

        System.out.println("6. Степень числа: a^b рекурсивно");
        System.out.println(power(2, 5));

        System.out.println("7. Проверка палиндрома рекурсивно");
        System.out.println(isPalindrome("javavaj"));

    }

    // 1️⃣ Сумма чисел от 1 до N (через рекурсию)
    static int sum(int num) {
        if (num == 0)
            return 0;
        int res = num + sum(num - 1);
        return res;
    }

    // 2️⃣ Вывести числа от 1 до N (рекурсивно)
    static void printNumbers(int n) {
        if (n == 0)
            return; //базовый случай
        System.out.println(n); // вывод при визове методов рекурсии
        printNumbers(n - 1); // рекурсивный вызов до 1
        System.out.println(n); // вывод после возврата
    }
    
    // 3️⃣ Найти факториал
    static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    //4️⃣ Рекурсивно вывести строку задом наперёд
    public static void printReverse(String str) {
        // Базовый случай: если строка пустая или состоит из одного символа
        if (str == null || str.length() <= 1) {
            System.out.print(str);
        } else {
            // Рекурсивный случай:
            // 1. Выводим последний символ
            System.out.print(str.charAt(str.length() - 1));
            // 2. Рекурсивно вызываем для строки без последнего символа
            printReverse(str.substring(0, str.length() - 1));
        }
    }


    // 🔥 Задачи посложнее
    // 5️⃣ Количество цифр в числе (через рекурсию)
    public static int countDigits(int number) {
        // Базовый случай: если число меньше 10, значит в нем 1 цифра
        if (number < 10 && number >= 0) {
            return 1;
        } else if (number < 0) {
            // Обрабатываем отрицательные числа
            return countDigits(-number);
        } else {
            // Рекурсивный случай: 
            // отбрасываем последнюю цифру (number / 10) и добавляем 1
            return 1 + countDigits(number / 10);
        }
    }



    // 6️⃣ Степень числа: a^b рекурсивно
    public static double power(double base, int exponent) {
        // Базовый случай: любое число в степени 0 равно 1
        if (exponent == 0) {
            return 1;
        }
        // Если степень отрицательная
        else if (exponent < 0) {
            return 1 / power(base, -exponent);
        }
        // Рекурсивный случай: a^b = a * a^(b-1)
        else {
            return base * power(base, exponent - 1);
        }
    }




    //7️⃣ Проверка палиндрома рекурсивно
    public static boolean isPalindrome(String str) {
    // Убираем пробелы и приводим к нижнему регистру для удобства
    String cleanStr = str.toLowerCase().replaceAll("\\s+", "");
    return isPalindromeHelper(cleanStr, 0, cleanStr.length() - 1);
}

private static boolean isPalindromeHelper(String str, int left, int right) {
    // Базовый случай: если дошли до середины
    if (left >= right) {
        return true;
    }
    // Если символы на позициях left и right не совпадают
    else if (str.charAt(left) != str.charAt(right)) {
        return false;
    }
    // Рекурсивный случай: проверяем следующую пару символов
    else {
        return isPalindromeHelper(str, left + 1, right - 1);
    }
}


}
