public class Main {
    public static void main(String[] args){
        int x =15;
        int y = 4;
        // первая задача
        System.out.printf("%-12s : %s%n", "Сумма",(x+y));
        System.out.println("Сумма: " + (x+y));
        System.out.println("Вычитание: " + (x+y));
        System.out.println("Умножение: " + (x*y));
        System.out.println("Деление: " + (x/y));
        System.out.println("Остаток от деления: " + (x%y));
        System.out.println("Увелечение на 1: " + x++);
        System.out.println("Уменшение на 1: " + x--);

        // Вторая задача 
        System.out.println("x>y && x четное?" + (x>y && x%2==0) + "x больше и чётное");
        System.out.println("y<10 || x==20" + (y<10 || x==20) + "y маленькое или x = 20");
        
        
    }
}
