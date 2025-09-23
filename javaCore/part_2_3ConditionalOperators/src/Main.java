public class Main {
    public static void main(String[] args){

        // Калькулятор
        int a=10, b=5;
        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-': 
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/': 
                System.out.println(a/b);
                break;
        
            default:
                System.out.println("неверный оператор");
                break;
        }

        System.out.println("\n");


        // Практика
        int age = 19;

        if(age<7){
            System.out.println("Ребёнок в садике");
        }else if(age>=7 || age<=18){
            System.out.println("Школьник");
        }else if(age>= 19 || age<=22){
            System.out.println("Студент");
        }else {
            System.out.println("Взрослый");
        }

        System.out.println("практика месяци\n");

        // практика 2 
        int month = 3;

        switch (month) {
            case 1:
                System.out.println("Яанварь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибка: нет такого месяца");
                break;
        }

        System.out.println("\nМесяци с помшью нового swith");

        String result = switch (month) {
            case 1 -> "Яанварь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10-> "Октябрь";
            case 11-> "Ноябрь";
            case 12-> "Декабрь";
            default -> "Неизвестный день";
        };
        System.out.println(result);


    }
}