public class Main {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } finally {
            System.out.println("Программа завершена.");
        }

        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка" );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива");
        }
    }
}
