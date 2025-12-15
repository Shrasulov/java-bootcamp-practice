public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Некорректный возраст: " + age);
        }
        this.name = name;
        this.age = age;
    }
}
