package part_2_4javaLoops.src;

public class Main {
    public static void main(String[] args){
        // 1 С помощью for выведи числа от 1 до 10.
        System.out.println("С помощью for выведи числа от 1 до 10");
        for (int i =1;i<=10;i++){
            System.out.println(i);
        }

        // С помощью while выведи только чётные числа от 2 до 20.
        System.out.println("\n С помощью while выведи только чётные числа от 2 до 20");
        int x = 2;
        while (x <= 20) {
        System.out.println(x);
        x += 2;
}

        //С помощью do-while просуммируй числа от 1 до 5 и выведи результат.
        System.out.println("\n С помощью do-while просуммируй числа от 1 до 5 и выведи результат.");
        int num = 1;
        int sum =0;
        do{
            sum+=num;
            num++;
        }while(num<=5);
        System.out.println("Сумма числе до 5: \t" + sum);
        
        //Сделай программу, которая выводит таблицу умножения (от 1 до 10).
        System.out.println("\nТаблица умножения:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
            System.out.printf("%4d", i * j); // выравнивание по 4 символа
            }
        System.out.println();
        }
        
        //(для челленджа 😎) Нарисуй в консоли прямоугольный треугольник из *:
        
        System.out.println("\n\nРисование треугольника\n");
        for(int i =0;i<=5;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\nТреугольник\n");

         for(int i = 1;i<=5;i++){
            // пробели
            for(int j =1;j<=5 -i;j++){
                System.out.print(" ");
            }
            //
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}