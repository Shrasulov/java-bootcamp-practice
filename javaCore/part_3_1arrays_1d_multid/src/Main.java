public class Main {

    public static void main(String[] args) {
        // 1. Создай массив из 5 чисел и выведи их в консоль.
        System.out.println("Создай массив из 5 чисел и выведи их в консоль.");
        /* 
        int nums[] = new int[5];
        nums[0] = 10;
        nums[4] = 123;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        } */

        int nums[] ={ 1, 4, 6, 3, 9 };
        //int nums[] = new int[] { 1, 4, 6, 3, 9 };
        for (int num : nums) {
            System.out.println(num);
        }


        // 2. Найди сумму элементов массива.
        System.out.println("\n\nНайди сумму элементов массива.");
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);


        // 3. Найди максимальный элемент массива.
        System.out.println("\n\nНайди максимальный элемент массива.");
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);



        // 4. Создай массив строк (имена друзей) и выведи их через for-each.
        System.out.println("\n\nСоздай массив строк (имена друзей) и выведи их через for-each.");
        String names[] = { "pitr", "parker", "grizunov" };
        for (String name : names) {
            System.out.println(name);
        }

        // 5. Создай двумерный массив 3x3 и выведи его как таблицу.
        System.out.println("\n\nСоздай двумерный массив 3x3 и выведи его как таблицу.");
        //int array[][] = new int[3][3];
        int array[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        // 6. Дополнительно: создай двумерный массив и посчитай сумму всех его элементов.
        System.out.println("\n\nДополнительно: создай двумерный массив и посчитай сумму всех его элементов.");
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("сумма всех чисел матрици = " + sum);
        
         

    }
}