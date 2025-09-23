package part_2_1userInfo.src;

public class Main {
    public static void main(String[] args){
        String name = "Amir";
        int age = 22;
        double height = 1.70;
        boolean isStudent = true;
        
        //System.out.println("\n Имя:\t"+ name + "\n Возраст \t" +age + "\n рост \t" + height + "\n Студент? \t" + isStudent);
        
        System.out.printf("%-12s : %s%n", "Имя", name);
        System.out.printf("%-12s : %d%n", "Возраст", age);
        System.out.printf("%-12s : %.2f%n", "Рост", height);
        System.out.printf("%-12s : %b%n", "Студент?", isStudent);

        System.out.println(10/3.0);
    }

}
