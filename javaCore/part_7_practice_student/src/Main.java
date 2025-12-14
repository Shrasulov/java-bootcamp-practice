import java.util.Scanner;

public class Main {

    public static void main(String[] arges) {
        
        Scanner sc = new Scanner(System.in);
        StudentManager student = new StudentManager();
        student.addStudent("ali");
        student.addStudent("bob");
        student.addStudent("amir");

        student.printAll();

        student.findStudent("ali");
        student.findStudent("davlat");
        student.addStudent("davlat");
        student.printAll();
        student.removeStudent("davlat");
        student.findStudent("davlat");
        student.printAll();
    }
}