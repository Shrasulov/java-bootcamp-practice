public class Main {

    public static void main(String[] args) {
        try {
            Student student = new Student("иван", -5);
        } catch (InvalidAgeException e) {
            System.out.println("Ошибка создания студента: " + e.getMessage());
        }
        

    }
}