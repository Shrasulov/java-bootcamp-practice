import java.util.ArrayList;

public class StudentManager {

    private ArrayList<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        System.out.println("Студент добавлен: " + name);
    }
    
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println("Студент удалён: " + name);
        } else {
            System.out.println("Студент не найден");
        }
    }
    
    public boolean findStudent(String name) {
        return students.contains(name);
    }

    public void printAll() {
        System.out.println("\n Список студентов: ");
        for (String s : students) {
            System.out.println("_ "+s);
        }
    }
}
